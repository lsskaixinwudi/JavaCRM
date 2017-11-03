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
import com.situ.crm.dao.CustomerServiceMapper;
import com.situ.crm.dao.CustomerServiceMapper;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerServiceExample;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.pojo.CustomerServiceExample.Criteria;
import com.situ.crm.service.ICustomerServiceService;
import com.situ.crm.util.Util;
@Service
public class CustomerServiceServiceImpl implements ICustomerServiceService{
	@Autowired
	private CustomerServiceMapper customerServiceMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService, Date begindate, Date enddate) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CustomerServiceExample customerServiceExample = new CustomerServiceExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = customerServiceExample.createCriteria();
		/*if (StringUtils.isNotEmpty(customerService.getCustomerName())) {
			createCriteria.andCustomerNameLike(Util.formatLike(customerService.getCustomerName()));
		}
		if (StringUtils.isNotEmpty(customerService.getCreateMan())) {
			createCriteria.andCreateManLike(Util.formatLike(customerService.getCreateMan()));
		}
		if (customerService.getStatus() != null) {
			createCriteria.andStatusEqualTo(customerService.getStatus());
		}
		if (customerService.getDevResult() != null) {
			createCriteria.andDevResultEqualTo(customerService.getDevResult());
		}*/
		if (begindate !=null && enddate != null) {
			createCriteria.andCreateTimeBetween(begindate, enddate);
		}
		List<CustomerService> customerServiceList = customerServiceMapper.selectByExample(customerServiceExample);
		//total
		PageInfo<CustomerService> pageInfo = new PageInfo<>(customerServiceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(customerServiceList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			customerServiceMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(CustomerService customerService) {
		if(StringUtils.isNotEmpty(customerService.getAssigner())){
			customerService.setStatus("");
		}else{
			customerService.setStatus("");
		}
		/*customerService.setDevResult(0);*/
		if(customerServiceMapper.insert(customerService)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(CustomerService customerService) {
		if(customerServiceMapper.updateByPrimaryKey(customerService)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public ServerResponse findById(Integer id) {
		CustomerService customerService = customerServiceMapper.selectByPrimaryKey(id);
		if (customerService != null) {
			return ServerResponse.createSuccess("查找成功! ", customerService);
		}
		return ServerResponse.createError("查找失败!");
	}

	/*@Override
	public ServerResponse updateDevResult(Integer customerServiceId, Integer devResult) {
		CustomerService customerService = new CustomerService();
		customerService.setId(customerServiceId);
		customerService.setDevResult(devResult);
		if (customerServiceMapper.updateByPrimaryKeySelective(customerService) > 0) {
			return ServerResponse.createSuccess("更新成功");
		}
		return ServerResponse.createError("更新失败");
	}*/


}
