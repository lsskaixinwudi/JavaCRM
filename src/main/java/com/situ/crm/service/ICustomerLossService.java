package com.situ.crm.service;

import java.util.Date;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerLoss;

public interface ICustomerLossService {
	/**
	 * 根据分页信息返回所有数据
	 * @param page 当前页
	 * @param rows 一页多少数据
	 * @return
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLoss customerLoss, Date beginTime, Date endTime);

	ServerResponse delete(String ids);

	ServerResponse add(CustomerLoss customerLoss);

	ServerResponse update(CustomerLoss customerLoss);

	ServerResponse findById(Integer id);
	
	ServerResponse updateStatus(Integer id, Integer status);
}