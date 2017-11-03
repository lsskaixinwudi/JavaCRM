package com.situ.crm.service.impl;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerContactMapper;
import com.situ.crm.pojo.CustomerContact;
import com.situ.crm.pojo.CustomerContactExample;
import com.situ.crm.pojo.CustomerContactExample.Criteria;
import com.situ.crm.service.ICustomerContactService;
import com.situ.crm.util.Util;

@Service
public class CustomerContactServiceImpl implements ICustomerContactService{
	@Autowired
	private CustomerContactMapper customerContactMapper;

	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerContact customerContact) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerContactExample customerContactExample = new CustomerContactExample();
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = customerContactExample.createCriteria();
		if (customerContact.getCustomerId() != null) {
			createCriteria.andCustomerIdEqualTo(customerContact.getCustomerId());
		}
		List<CustomerContact> customerContactList = customerContactMapper.selectByExample(customerContactExample);
		//total
		int total = customerContactMapper.countByExample(new CustomerContactExample());
		
		result.setTotal(total);
		result.setRows(customerContactList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerContactMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}
	
	@Override
	public ServerResponse deleteById(Integer id) {
		if (customerContactMapper.deleteByPrimaryKey(id) > 0) {
			return ServerResponse.createSuccess("删除数据成功 ");
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(CustomerContact customerContact) {
		if (customerContactMapper.insert(customerContact) > 0) {
			return ServerResponse.createSuccess("添加成功! ");
		}
		return ServerResponse.createError("添加失败!");
	}

	@Override
	public ServerResponse update(CustomerContact customerContact) {
		if (customerContactMapper.updateByPrimaryKey(customerContact) > 0) {
			return ServerResponse.createSuccess("修改成功! ");
		}
		return ServerResponse.createError("修改失败!");
	}

}
