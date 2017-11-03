package com.situ.crm.service;

import java.util.Date;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerLossMeasure;

public interface ICustomerLossMeasureService {
	/**
	 * 根据分页信息返回所有数据
	 * @param page 当前页
	 * @param rows 一页多少数据
	 * @return
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLossMeasure customerLossMeasure, Date beginTime, Date endTime);

	ServerResponse delete(String ids);

	ServerResponse add(CustomerLossMeasure customerLossMeasure);

	ServerResponse update(CustomerLossMeasure customerLossMeasure);

	ServerResponse findById(Integer id);
	
	ServerResponse updateDevResult(Integer customerLossMeasureId, Integer devResult);

}