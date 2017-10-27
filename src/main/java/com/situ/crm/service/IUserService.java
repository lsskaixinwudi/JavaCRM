package com.situ.crm.service;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.User;

public interface IUserService {
	/**
	 * 返回所有数据
	 * @param rows 
	 * @param page 
	 * @param user 
	 * @return 分装好的EasyUIDataGrideResult对象
	 */
	EasyUIDataGrideResult findAll(Integer page, Integer rows, User user);

	ServerResponse delete(String ids);
}
