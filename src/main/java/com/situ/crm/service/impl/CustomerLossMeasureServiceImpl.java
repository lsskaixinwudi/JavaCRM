package com.situ.crm.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerLossMeasureMapper;
import com.situ.crm.pojo.CustomerLossMeasure;
import com.situ.crm.pojo.CustomerLossMeasureExample;
import com.situ.crm.pojo.CustomerLossMeasureExample.Criteria;
import com.situ.crm.service.ICustomerLossMeasureService;
import com.situ.crm.util.Util;

@Service
public class CustomerLossMeasureServiceImpl implements ICustomerLossMeasureService{
	@Autowired
	private CustomerLossMeasureMapper customerLossMeasureMapper;
    
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLossMeasure customerLossMeasure, Date beginTime, Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerLossMeasureExample customerLossMeasureExample = new CustomerLossMeasureExample();
		Criteria createCriteria = customerLossMeasureExample.createCriteria();
		if (customerLossMeasure.getLossId() != null) {
			createCriteria.andLossIdEqualTo(customerLossMeasure.getLossId());
		}
		List<CustomerLossMeasure> customerLossMeasureList = customerLossMeasureMapper.selectByExample(customerLossMeasureExample);
		//total
		PageInfo<CustomerLossMeasure> pageInfo = new PageInfo<>(customerLossMeasureList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerLossMeasureList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerLossMeasureMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据删除成功！");
	}

	@Override
	public ServerResponse add(CustomerLossMeasure customerLossMeasure) {
		if (customerLossMeasureMapper.insert(customerLossMeasure) > 0) {
			return ServerResponse.createSuccess("添加成功！ ");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(CustomerLossMeasure customerLossMeasure) {

		if (customerLossMeasureMapper.updateByPrimaryKey(customerLossMeasure) > 0) {
			return ServerResponse.createSuccess("修改成功！ ");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public ServerResponse findById(Integer id) {
		CustomerLossMeasure customerLossMeasure = customerLossMeasureMapper.selectByPrimaryKey(id);
		if (customerLossMeasure != null) {
			return ServerResponse.createSuccess("查找成功！", customerLossMeasure);
		}
		return ServerResponse.createError("查找失败！");
	}
	

	@Override
	public ServerResponse updateDevResult(Integer customerLossMeasureId, Integer devResult) {
		CustomerLossMeasure customerLossMeasure = new CustomerLossMeasure();
		customerLossMeasure.setId(customerLossMeasureId);
		/*customerLossMeasure.setDevResult(devResult);*/
		if (customerLossMeasureMapper.updateByPrimaryKeySelective(customerLossMeasure) > 0) {
			return ServerResponse.createSuccess("鏇存柊鎴愬姛");
		}
		return ServerResponse.createError("鏇存柊澶辫触");
	}


}
