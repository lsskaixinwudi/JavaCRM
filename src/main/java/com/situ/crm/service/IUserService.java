package com.situ.crm.service;

import com.situ.crm.common.EasyUIDataGrideResult;

public interface IUserService {
	/**
	 * 返回所有数据
	 * @return 分装好的EasyUIDataGrideResult对象
	 */
	EasyUIDataGrideResult findAll();
}
