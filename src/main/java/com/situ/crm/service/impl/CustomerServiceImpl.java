package com.situ.crm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import com.situ.crm.pojo.Customer;
import com.situ.crm.pojo.CustomerExample;
import com.situ.crm.pojo.CustomerExample.Criteria;
import com.situ.crm.pojo.CustomerLoss;
import com.situ.crm.pojo.CustomerOrder;
import com.situ.crm.service.ICustomerService;
import com.situ.crm.util.Util;

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

}
