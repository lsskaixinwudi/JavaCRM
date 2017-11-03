package com.situ.crm.service;

import java.util.List;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.Customer;

public interface ICustomerService {
	/**
	 * 返回所有数据
	 * @param rows 
	 * @param page 
	 * @param customer 
	 * @return 分装好的EasyUIDataGrideResult对象
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, Customer customer);

	ServerResponse delete(String ids);

	ServerResponse add(Customer customer);

	ServerResponse update(Customer customer);



	Customer getCustomer(String name, String password);



	Customer getCustomerId(Customer customer);

	ServerResponse updateById(Customer customer);

	List<Customer> findCustomerNum();

	ServerResponse findById(Integer id);

}
