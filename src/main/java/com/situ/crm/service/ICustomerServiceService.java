package com.situ.crm.service;

import java.util.Date;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerService;

public interface ICustomerServiceService {

	EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService, Date begindate, Date enddate);

	ServerResponse delete(String ids);

	ServerResponse add(CustomerService customerService);

	ServerResponse update(CustomerService customerService);

	ServerResponse findById(Integer id);

	/*ServerResponse updateDevResult(Integer customerServiceId, Integer devResult);*/

}
