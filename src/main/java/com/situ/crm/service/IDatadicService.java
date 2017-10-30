package com.situ.crm.service;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.DataDic;

public interface IDataDicService {
	/**
	 * 返回所有数据
	 * @param rows 
	 * @param page 
	 * @param datadic 
	 * @return 分装好的EasyUIDataGrideResult对象
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, DataDic datadic);

	ServerResponse delete(String ids);

	ServerResponse add(DataDic datadic);

	ServerResponse update(DataDic datadic);
}
