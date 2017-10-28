package com.situ.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.DatadicMapper;
import com.situ.crm.pojo.Datadic;
import com.situ.crm.pojo.DatadicExample;
import com.situ.crm.pojo.DatadicExample.Criteria;
import com.situ.crm.service.IDatadicService;
import com.situ.crm.util.Util;

@Service
public class DatadicServiceImpl implements IDatadicService{
	@Autowired
	private DatadicMapper datadicMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, Datadic datadic) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		DatadicExample datadicExample = new DatadicExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = datadicExample.createCriteria();
		if (StringUtils.isNotEmpty(datadic.getDatadicName())) {
			createCriteria.andDatadicNameLike(Util.formatLike(datadic.getDatadicName()));
		}
		List<Datadic> datadicList = datadicMapper.selectByExample(datadicExample);
		//total
		PageInfo<Datadic> pageInfo = new PageInfo<>(datadicList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(datadicList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			datadicMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(Datadic datadic) {
		if(datadicMapper.insert(datadic)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(Datadic datadic) {
		if(datadicMapper.updateByPrimaryKey(datadic)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

}
