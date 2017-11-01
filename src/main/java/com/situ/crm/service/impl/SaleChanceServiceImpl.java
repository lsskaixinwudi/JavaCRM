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
import com.situ.crm.dao.SaleChanceMapper;
import com.situ.crm.dao.SaleChanceMapper;
import com.situ.crm.pojo.SaleChance;
import com.situ.crm.pojo.SaleChance;
import com.situ.crm.pojo.SaleChanceExample;
import com.situ.crm.pojo.SaleChance;
import com.situ.crm.pojo.SaleChanceExample.Criteria;
import com.situ.crm.service.ISaleChanceService;
import com.situ.crm.util.Util;
@Service
public class SaleChanceServiceImpl implements ISaleChanceService{
	@Autowired
	private SaleChanceMapper saleChanceMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, SaleChance saleChance, Date begindate, Date enddate) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		SaleChanceExample saleChanceExample = new SaleChanceExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = saleChanceExample.createCriteria();
		if (StringUtils.isNotEmpty(saleChance.getCustomerName())) {
			createCriteria.andCustomerNameLike(Util.formatLike(saleChance.getCustomerName()));
		}
		if (StringUtils.isNotEmpty(saleChance.getCreateMan())) {
			createCriteria.andCreateManLike(Util.formatLike(saleChance.getCreateMan()));
		}
		if (saleChance.getStatus() != null) {
			createCriteria.andStatusEqualTo(saleChance.getStatus());
		}
		if (saleChance.getDevResult() != null) {
			createCriteria.andDevResultEqualTo(saleChance.getDevResult());
		}
		if (begindate !=null && enddate != null) {
			createCriteria.andCreateTimeBetween(begindate, enddate);
		}
		List<SaleChance> saleChanceList = saleChanceMapper.selectByExample(saleChanceExample);
		//total
		PageInfo<SaleChance> pageInfo = new PageInfo<>(saleChanceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(saleChanceList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			saleChanceMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(SaleChance saleChance) {
		if(StringUtils.isNotEmpty(saleChance.getAssignMan())){
			saleChance.setStatus(1);
		}else{
			saleChance.setStatus(0);
		}
		saleChance.setDevResult(0);
		if(saleChanceMapper.insert(saleChance)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(SaleChance saleChance) {
		if(saleChanceMapper.updateByPrimaryKey(saleChance)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public ServerResponse findById(Integer id) {
		SaleChance saleChance = saleChanceMapper.selectByPrimaryKey(id);
		if (saleChance != null) {
			return ServerResponse.createSuccess("查找成功! ", saleChance);
		}
		return ServerResponse.createError("查找失败!");
	}

	@Override
	public ServerResponse updateDevResult(Integer saleChanceId, Integer devResult) {
		SaleChance saleChance = new SaleChance();
		saleChance.setId(saleChanceId);
		saleChance.setDevResult(devResult);
		if (saleChanceMapper.updateByPrimaryKeySelective(saleChance) > 0) {
			return ServerResponse.createSuccess("更新成功");
		}
		return ServerResponse.createError("更新失败");
	}


}
