package com.situ.crm.service.impl;

import java.util.List;

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
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.UserMapper;
import com.situ.crm.pojo.User;
import com.situ.crm.pojo.UserExample;
import com.situ.crm.pojo.Product;
import com.situ.crm.pojo.User;
import com.situ.crm.pojo.UserExample;
import com.situ.crm.pojo.UserExample.Criteria;
import com.situ.crm.service.IUserService;
import com.situ.crm.util.Util;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, User user) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		UserExample userExample = new UserExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = userExample.createCriteria();
		if (StringUtils.isNotEmpty(user.getName())) {
			createCriteria.andNameLike(Util.formatLike(user.getName()));
		}
		if (StringUtils.isNotEmpty(user.getTrueName())) {
			createCriteria.andTrueNameLike(Util.formatLike(user.getTrueName()));
		}
		List<User> userList = userMapper.selectByExample(userExample);
		//total
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(userList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			userMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(User user) {
		if(userMapper.insert(user)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(User user) {
		if(userMapper.updateByPrimaryKey(user)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public List<User> findUserName() {
		return userMapper.findUserName();
	}

	@Override
	public User getUser(String name, String password) {
		return userMapper.getUser(name,password);
	}

	@Override
	public ServerResponse updateById(User user) {
		if(userMapper.updateByPrimaryKeySelective(user)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public User getUserId(User user) {
		return userMapper.getUserId(user);
	}

	@Override
	public List<User> getCustomerManagerList() {
		UserExample userExample =  new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andRoleNameEqualTo("客户经理");
		List<User> userList = userMapper.selectByExample(userExample);
		return userList;
	}
	
	@Override
	public void exportExcel2(ServletOutputStream outputStream) {
		List<User> list = userMapper.selectByExample(new UserExample());
 		try {
 			// 1、创建工作簿
 			HSSFWorkbook workbook = new HSSFWorkbook();
 			// 1.1、创建合并单元格对象
 			CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 6);// 起始行号，结束行号，起始列号，结束列号
 
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
 			cell1.setCellValue("用户列表");
 
 			// 3.2、创建列标题行；并且设置列标题
 			HSSFRow row2 = sheet.createRow(1);
 			String[] titles = { "编号", "用户名", "用户密码","真实姓名","邮件","联系电话","角色" };
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
 					HSSFCell cellName = row.createCell(1);
 					cellName.setCellValue(list.get(j).getName());
 					HSSFCell cellPassword = row.createCell(2);
 					cellPassword.setCellValue(list.get(j).getPassword());
 					HSSFCell cellTrueName = row.createCell(3);
 					cellTrueName.setCellValue(list.get(j).getTrueName());
 					HSSFCell cellEmail = row.createCell(4);
 					cellEmail.setCellValue(list.get(j).getEmail());
 					HSSFCell cellPhone = row.createCell(5);
 					cellPhone.setCellValue(list.get(j).getPhone());
 					HSSFCell cellRoleName = row.createCell(6);
 					cellRoleName.setCellValue(list.get(j).getRoleName());
 					
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
