package com.situ.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.dao.UserMapper;
import com.situ.crm.pojo.User;
import com.situ.crm.pojo.UserExample;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public EasyUIDataGrideResult findAll() {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		UserExample userExample = new UserExample();
		//total
		int total = userMapper.countByExample(userExample);
		//rows
		List<User> rows = userMapper.selectByExample(userExample);
		
		result.setTotal(total);
		result.setRows(rows);
		return result;
	}

}
