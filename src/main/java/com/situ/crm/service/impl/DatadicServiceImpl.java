package com.situ.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.DataDicMapper;
import com.situ.crm.pojo.DataDic;
import com.situ.crm.pojo.DataDicExample;
import com.situ.crm.pojo.DataDicExample.Criteria;
import com.situ.crm.service.IDataDicService;
import com.situ.crm.util.Util;

@Service
public class DataDicServiceImpl implements IDataDicService{
	@Autowired
	private DataDicMapper datadicMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, DataDic datadic) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		DataDicExample datadicExample = new DataDicExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = datadicExample.createCriteria();
		if (StringUtils.isNotEmpty(datadic.getDataDicName())) {
			createCriteria.andDataDicNameLike(Util.formatLike(datadic.getDataDicName()));
		}
		List<DataDic> datadicList = datadicMapper.selectByExample(datadicExample);
		//total
		PageInfo<DataDic> pageInfo = new PageInfo<>(datadicList);
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
	public ServerResponse add(DataDic datadic) {
		if(datadicMapper.insert(datadic)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(DataDic datadic) {
		if(datadicMapper.updateByPrimaryKey(datadic)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

}
