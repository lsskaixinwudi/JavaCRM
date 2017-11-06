package com.situ.crm.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CustomerLossMapper;
import com.situ.crm.pojo.CustomerLoss;
import com.situ.crm.pojo.CustomerLossExample;
import com.situ.crm.pojo.CustomerLossExample.Criteria;
import com.situ.crm.service.ICustomerLossService;
import com.situ.crm.util.Util;

@Service
public class CustomerLossServiceImpl implements ICustomerLossService{
	@Autowired
	private CustomerLossMapper customerLossMapper;

	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLoss customerLoss, Date beginTime, Date endTime) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerLossExample customerLossExample = new CustomerLossExample();
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = customerLossExample.createCriteria();
		if (StringUtils.isNotEmpty(customerLoss.getCustomerName())) {
			createCriteria.andCustomerNameLike(Util.formatLike(customerLoss.getCustomerName()));
		}
		if (customerLoss.getStatus() != null) {
			createCriteria.andStatusEqualTo(customerLoss.getStatus());
		}
		List<CustomerLoss> customerLossList = customerLossMapper.selectByExample(customerLossExample);
		//total
		PageInfo<CustomerLoss> pageInfo = new PageInfo<>(customerLossList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerLossList);
		return result;
	}
	
	@Override
	public EasyUIDataGrideResult findAll2(Integer page, Integer rows, CustomerLoss customerLoss) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerLossExample customerLossExample = new CustomerLossExample();
		PageHelper.startPage(page, rows);
		Criteria createCriteria = customerLossExample.createCriteria();
		if (StringUtils.isNotEmpty(customerLoss.getCustomerName())) {
			try {
				createCriteria.andCustomerNameLike(Util.formatLike(new String(customerLoss.getCustomerName().getBytes("iso-8859-1"),"utf-8")));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		if (StringUtils.isNotEmpty(customerLoss.getCustomerManager())) {
			try {
				createCriteria.andCustomerManagerLike(Util.formatLike(new String(customerLoss.getCustomerManager().getBytes("iso-8859-1"),"utf-8")));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		if (null != customerLoss.getStatus()) {
				createCriteria.andStatusEqualTo(customerLoss.getStatus());
			}
		createCriteria.andStatusEqualTo(1);
		//list
		List<CustomerLoss> customerLossList = customerLossMapper.selectByExample(customerLossExample);
		PageInfo<CustomerLoss> pageInfo = new PageInfo<>(customerLossList);
		//total
		Integer total = (int) pageInfo.getTotal();
		result.setTotal(total);
		result.setRows(customerLossList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerLossMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(CustomerLoss customerLoss) {
		if (customerLossMapper.insert(customerLoss) > 0) {
			return ServerResponse.createSuccess("添加成功！ ");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(CustomerLoss customerLoss) {

		if (customerLossMapper.updateByPrimaryKey(customerLoss) > 0) {
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public ServerResponse findById(Integer id) {
		CustomerLoss customerLoss = customerLossMapper.selectByPrimaryKey(id);
		if (customerLoss != null) {
			return ServerResponse.createSuccess("查找成功！ ", customerLoss);
		}
		return ServerResponse.createError("查找失败！");
	}
	

	@Override
	public ServerResponse updateStatus(Integer id, Integer status) {
		CustomerLoss customerLoss = new CustomerLoss();
		customerLoss.setId(id);
		customerLoss.setStatus(status);
		if (customerLossMapper.updateByPrimaryKeySelective(customerLoss) > 0) {
			return ServerResponse.createSuccess("鏇存柊鎴愬姛");
		}
		return ServerResponse.createError("鏇存柊澶辫触");
	}
}