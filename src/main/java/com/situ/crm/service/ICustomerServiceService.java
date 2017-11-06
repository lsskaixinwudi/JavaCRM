package com.situ.crm.service;

import java.util.Date;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerService;

public interface ICustomerServiceService {

	EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime);
	ServerResponse delete(String ids);

	ServerResponse add(CustomerService customerService);

	ServerResponse update(CustomerService customerService);
	EasyUIDataGrideResult findAll1(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime);
	EasyUIDataGrideResult findAll2(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime);
	EasyUIDataGrideResult findAll3(Integer page, Integer rows, CustomerService customerService, Date beginTime,
			Date endTime);
	ServerResponse getServiceDealPeople(CustomerService customerService);
}
