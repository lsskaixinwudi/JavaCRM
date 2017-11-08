package com.situ.crm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerLossMapper;
import com.situ.crm.dao.CustomerMapper;
import com.situ.crm.dao.CustomerOrderMapper;
import com.situ.crm.dao.CustomerServiceMapper;
import com.situ.crm.pojo.Customer;
import com.situ.crm.pojo.CustomerExample;
import com.situ.crm.pojo.CustomerExample.Criteria;
import com.situ.crm.pojo.CustomerLoss;
import com.situ.crm.pojo.CustomerOrder;
import com.situ.crm.pojo.Customer;
import com.situ.crm.pojo.CustomerExample;
import com.situ.crm.service.ICustomerService;
import com.situ.crm.util.Util;
import com.situ.crm.vo.CustomerConstitute;
import com.situ.crm.vo.CustomerContribute;
import com.situ.crm.vo.khfu;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	    dateFormat.setLenient(false); 
	    binder.registerCustomEditor(Date.class,
	           new CustomDateEditor(dateFormat, true));
	}
	
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private CustomerOrderMapper customerOrderMapper;
	@Autowired
	private CustomerLossMapper customerLossMapper;
	@Autowired
	private CustomerServiceMapper customerServiceMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, Customer customer) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerExample customerExample = new CustomerExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = customerExample.createCriteria();
		if (StringUtils.isNotEmpty(customer.getName())) {
			createCriteria.andNameLike(Util.formatLike(customer.getName()));
		}
		if (StringUtils.isNotEmpty(customer.getNum())) {
			createCriteria.andNumLike(Util.formatLike(customer.getNum()));
		}
		List<Customer> customerList = customerMapper.selectByExample(customerExample);
		//total
		PageInfo<Customer> pageInfo = new PageInfo<>(customerList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(Customer customer) {
		if(customerMapper.insert(customer)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(Customer customer) {
		if(customerMapper.updateByPrimaryKey(customer)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public List<Customer> findCustomerNum() {
		return customerMapper.findCustomerNum();
	}

	@Override
	public Customer getCustomer(String name, String password) {
		return customerMapper.getCustomer(name,password);
	}

	@Override
	public ServerResponse updateById(Customer customer) {
		if(customerMapper.updateByPrimaryKeySelective(customer)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public Customer getCustomerId(Customer customer) {
		return customerMapper.getCustomerId(customer);
	}

	@Override
	public ServerResponse findById(Integer id) {
		Customer customer = customerMapper.selectByPrimaryKey(id);
		if (customer != null) {
			return ServerResponse.createSuccess("查找成功! ", customer);
		}
		return ServerResponse.createError("查找失败!");
	}

	@Override
	public void checkCustomerLoss() {
	    System.out.println("CustomerServiceImpl.checkCustomerLoss()");
	    // 1、查找流失客户
	    List<Customer> customerList = customerMapper.findLossCustomer();
	    for (Customer customer : customerList) {
	       // 2、实例化客户流失实体
	       CustomerLoss customerLoss = new CustomerLoss();
	        customerLoss.setCustomerNo(customer.getNum()); // 客户编号
	        customerLoss.setCustomerName(customer.getName()); // 客户名称
	        customerLoss.setCustomerManager(customer.getManagerName()); // 客户经理
	        // 3、查找指定客户最近的订单
	       CustomerOrder customerOrder = customerOrderMapper.findLastOrderByCustomerId(customer.getId());
	       if (customerOrder == null) {
	           customerLoss.setLastOrderTime(null);
	       } else {
	           customerLoss.setLastOrderTime(customerOrder.getOrderDate()); // 设置最近的下单日期
	       }
	        // 4、添加到客户流失表
	        customerLossMapper.insert(customerLoss);
	       // 5、客户表中客户状态修改成1 流失状态
	       customer.setStatus(1);
	        customerMapper.updateByPrimaryKeySelective(customer);
	    }
	}
	
	@Override
	public EasyUIDataGrideResult findCustomerContribute(Integer page, Integer rows, CustomerContribute customerContribute) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtils.isNoneBlank(customerContribute.getName())) {
			map.put("name", customerContribute.getName());
		}
		List<CustomerContribute> list = customerMapper.findCustomerContribute(map);
		PageInfo<CustomerContribute> pageInfo = new PageInfo<>(list);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(list);
		return result;
	}

	@Override
	public EasyUIDataGrideResult selectCustomerContribute(Integer page, Integer rows,CustomerContribute customerContribute) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		//1、设置分页 
		/*PageHelper.startPage(page, rows);*/
		//2、执行查询
		//rows(分页之后的数据)
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtils.isNoneBlank(customerContribute.getName())) {
			map.put("name", customerContribute.getName());
		}
		List<CustomerContribute> list = customerMapper.selectCustomerContribute(map);
		//total
		PageInfo<CustomerContribute> pageInfo = new PageInfo<>(list);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(list);
		return result;
	}

	@Override
	public ServerResponse findCustomerConstitute() {
		List<CustomerConstitute> list = customerMapper.findCustomerConstitute();
		return ServerResponse.createSuccess("查找成功！", list);
	}

	@Override
	public ServerResponse findkhfw() {
		List<khfu> list = customerServiceMapper.findkhfw();
		return ServerResponse.createSuccess("查找成功！", list);
	}

	@Override
	public void exportExcel1(ServletOutputStream outputStream) {
		List<Customer> list = customerMapper.selectByExample(new CustomerExample());
 		try {
 			// 1、创建工作簿
 			HSSFWorkbook workbook = new HSSFWorkbook();
 			// 1.1、创建合并单元格对象
 			CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 4);// 起始行号，结束行号，起始列号，结束列号
 
 			// 1.2、头标题样式
 			HSSFCellStyle style1 = createCellStyle(workbook, (short) 16);
 
 			// 1.3、列标题样式
 			HSSFCellStyle style2 = createCellStyle(workbook, (short) 13);
 
 			// 2、创建工作表
 			HSSFSheet sheet = workbook.createSheet("用户列表");
 			// 2.1、加载合并单元格对象
 			sheet.addMergedRegion(cellRangeAddress);
 			// 设置默认列宽
 			sheet.setDefaultColumnWidth(25);
 
 			// 3、创建行
 			// 3.1、创建头标题行；并且设置头标题
 			HSSFRow row1 = sheet.createRow(0);
 			HSSFCell cell1 = row1.createCell(0);
 			// 加载单元格样式
 			cell1.setCellStyle(style1);
 			cell1.setCellValue("客户列表");
 
 			// 3.2、创建列标题行；并且设置列标题
 			HSSFRow row2 = sheet.createRow(1);
 			String[] titles = { "客户编号", "客户名称", "客户经理", "客户等级", "联系电话","客户地区","客户满意度","客户信誉度" };
 			for (int i = 0; i < titles.length; i++) {
 				HSSFCell cell2 = row2.createCell(i);
 				// 加载单元格样式
 				cell2.setCellStyle(style2);
 				cell2.setCellValue(titles[i]);
 			}
 
 			// 4、操作单元格；将用户列表写入excel
 			if (list != null) {
 				for (int j = 0; j < list.size(); j++) {
 					HSSFRow row = sheet.createRow(j + 2);
 					HSSFCell cellId = row.createCell(0);
 					cellId.setCellValue(list.get(j).getId());
 					HSSFCell cellNum = row.createCell(1);
 					cellNum.setCellValue(list.get(j).getNum());
 					HSSFCell cellName = row.createCell(2);
 					cellName.setCellValue(list.get(j).getName());
 					HSSFCell cellManagerName = row.createCell(3);
 					cellManagerName.setCellValue(list.get(j).getManagerName());
 					HSSFCell cellLevel = row.createCell(4);
 					cellLevel.setCellValue(list.get(j).getLevel());
 					HSSFCell cellPhone = row.createCell(5);
 					cellPhone.setCellValue(list.get(j).getPhone());
 					HSSFCell cellAddress = row.createCell(6);
 					cellAddress.setCellValue(list.get(j).getAddress());
 					HSSFCell cellSatisfy = row.createCell(7);
 					cellSatisfy.setCellValue(list.get(j).getSatisfy());
 					HSSFCell cellCredit = row.createCell(8);
 					cellCredit.setCellValue(list.get(j).getCredit());
 				}
 			}
 			// 5、输出
 			workbook.write(outputStream);
 			workbook.close();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
 
 	/**
 	 * 创建单元格样式
 	 * 
 	 * @param workbook
 	 *            工作簿
 	 * @param fontSize
 	 *            字体大小
 	 * @return 单元格样式
 	 */
 	private static HSSFCellStyle createCellStyle(HSSFWorkbook workbook, short fontSize) {
 		HSSFCellStyle style = workbook.createCellStyle();
 		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 水平居中
 		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直居中
 		// 创建字体
 		HSSFFont font = workbook.createFont();
 		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗字体
 		font.setFontHeightInPoints(fontSize);
 		// 加载字体
 		style.setFont(font);
 		return style;
 	}
}
