package com.situ.crm.service;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerLinkman;

public interface ICustomerLinkmanService {
	/**
	 * 根据分页信息返回所有数据
	 * @param page 当前页
	 * @param rows 一页多少数据
	 * @return
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLinkman customerLinkman);

	ServerResponse delete(String ids);

	ServerResponse add(CustomerLinkman customerLinkman);

	ServerResponse update(CustomerLinkman customerLinkman);

	ServerResponse deleteById(Integer id);

	ServerResponse updateById(CustomerLinkman customerLinkman);

	ServerResponse findByCustomerId(CustomerLinkman customerLinkman);

}