package com.situ.crm.service.impl;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerOrderMapper;
import com.situ.crm.pojo.CustomerOrder;
import com.situ.crm.pojo.CustomerOrderExample;
import com.situ.crm.pojo.CustomerOrderExample.Criteria;
import com.situ.crm.service.ICustomerOrderService;
import com.situ.crm.util.Util;

@Service
public class CustomerOrderServiceImpl implements ICustomerOrderService{
	@Autowired
	private CustomerOrderMapper customerOrderMapper;

	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerOrder customerOrder) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerOrderExample customerOrderExample = new CustomerOrderExample();
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = customerOrderExample.createCriteria();
		if (customerOrder.getCustomerId() != null) {
			createCriteria.andCustomerIdEqualTo(customerOrder.getCustomerId());
		}
		List<CustomerOrder> customerOrderList = customerOrderMapper.selectByExample(customerOrderExample);
		//total
		int total = customerOrderMapper.countByExample(new CustomerOrderExample());
		
		result.setTotal(total);
		result.setRows(customerOrderList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerOrderMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}
	
	@Override
	public ServerResponse deleteById(Integer id) {
		if (customerOrderMapper.deleteByPrimaryKey(id) > 0) {
			return ServerResponse.createSuccess("删除数据成功 ");
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(CustomerOrder customerOrder) {
		if (customerOrderMapper.insert(customerOrder) > 0) {
			return ServerResponse.createSuccess("添加成功! ");
		}
		return ServerResponse.createError("添加失败!");
	}

	@Override
	public ServerResponse update(CustomerOrder customerOrder) {
		if (customerOrderMapper.updateByPrimaryKey(customerOrder) > 0) {
			return ServerResponse.createSuccess("修改成功! ");
		}
		return ServerResponse.createError("修改失败!");
	}

}
