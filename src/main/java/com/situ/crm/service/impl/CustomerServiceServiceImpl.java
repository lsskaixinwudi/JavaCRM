package com.situ.crm.service.impl;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerServiceMapper;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerServiceExample;
import com.situ.crm.pojo.CustomerServiceExample.Criteria;
import com.situ.crm.service.ICustomerServiceService;
import com.situ.crm.util.Util;

@Service
public class CustomerServiceServiceImpl implements ICustomerServiceService{
	@Autowired
	private CustomerServiceMapper customerServiceMapper;

	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService, Date beginTime, Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerServiceExample customerServiceExample = new CustomerServiceExample();
		
		PageHelper.startPage(page, rows);
		
		Criteria createCriteria = customerServiceExample.createCriteria();
		if (StringUtils.isNotEmpty(customerService.getCustomer())) {
			createCriteria.andCustomerLike(Util.formatLike(customerService.getCustomer()));
		}
		if (StringUtils.isNotEmpty(customerService.getOverview())) {
			createCriteria.andOverviewLike(Util.formatLike(customerService.getOverview()));
		}
		
		if (StringUtils.isNotEmpty(customerService.getServiceType())) {
			createCriteria.andServiceTypeLike(Util.formatLike(customerService.getServiceType()));
		}
	
		if (beginTime != null && endTime!= null) {
			createCriteria.andCreateTimeBetween(beginTime, endTime);
		}
		List<CustomerService> customerServiceList = customerServiceMapper.selectByExample(customerServiceExample);
		//total
		PageInfo<CustomerService> pageInfo = new PageInfo<>(customerServiceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerServiceList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerServiceMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据成功删除！");
	}

	@Override
	public ServerResponse add(CustomerService customerService) {
		if (customerServiceMapper.insert(customerService) > 0) {
			return ServerResponse.createSuccess("添加成功！ ");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(CustomerService customerService) {
		if (customerServiceMapper.updateByPrimaryKey(customerService) > 0) {
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public EasyUIDataGrideResult findAll1(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerServiceExample customerServiceExample = new CustomerServiceExample();
		
		PageHelper.startPage(page, rows);
		
		Criteria createCriteria = customerServiceExample.createCriteria();

		List<CustomerService> customerServiceList = customerServiceMapper.selectByExample1(customerServiceExample);
		//total
		PageInfo<CustomerService> pageInfo = new PageInfo<>(customerServiceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerServiceList);
		return result;
	}

	@Override
	public EasyUIDataGrideResult findAll2(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerServiceExample customerServiceExample = new CustomerServiceExample();
		
		PageHelper.startPage(page, rows);
		
		Criteria createCriteria = customerServiceExample.createCriteria();

		List<CustomerService> customerServiceList = customerServiceMapper.selectByExample2(customerServiceExample);
		//total
		PageInfo<CustomerService> pageInfo = new PageInfo<>(customerServiceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerServiceList);
		return result;
	}

	@Override
	public EasyUIDataGrideResult findAll3(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerServiceExample customerServiceExample = new CustomerServiceExample();
		
		PageHelper.startPage(page, rows);
		
		Criteria createCriteria = customerServiceExample.createCriteria();

		List<CustomerService> customerServiceList = customerServiceMapper.selectByExample3(customerServiceExample);
		
		PageInfo<CustomerService> pageInfo = new PageInfo<>(customerServiceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerServiceList);
		return result;
	}

	@Override
	public ServerResponse getServiceDealPeople(CustomerService customerService) {
		return customerServiceMapper.getServiceDealPeople(customerService);
	}





}
