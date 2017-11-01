package com.situ.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.CusDevPlanMapper;
import com.situ.crm.pojo.CusDevPlan;
import com.situ.crm.pojo.CusDevPlanExample;
import com.situ.crm.pojo.CusDevPlanExample.Criteria;
import com.situ.crm.service.ICusDevPlanService;
import com.situ.crm.util.Util;

@Service
public class CusDevPlanServiceImpl implements ICusDevPlanService{
	@Autowired
	private CusDevPlanMapper cusDevPlanMapper;

	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CusDevPlan cusDevPlan) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		CusDevPlanExample cusDevPlanExample = new CusDevPlanExample();
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = cusDevPlanExample.createCriteria();
		if (cusDevPlan.getSaleChanceId() != null) {
			createCriteria.andSaleChanceIdEqualTo(cusDevPlan.getSaleChanceId());
		}
		List<CusDevPlan> cusDevPlanList = cusDevPlanMapper.selectByExample(cusDevPlanExample);
		//total
		int total = cusDevPlanMapper.countByExample(new CusDevPlanExample());
		
		result.setTotal(total);
		result.setRows(cusDevPlanList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			cusDevPlanMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(CusDevPlan cusDevPlan) {
		if (cusDevPlanMapper.insert(cusDevPlan) > 0) {
			return ServerResponse.createSuccess("添加成功! ");
		}
		return ServerResponse.createError("添加失败!");
	}

	@Override
	public ServerResponse update(CusDevPlan cusDevPlan) {
		if (cusDevPlanMapper.updateByPrimaryKey(cusDevPlan) > 0) {
			return ServerResponse.createSuccess("修改成功! ");
		}
		return ServerResponse.createError("修改失败!");
	}

	@Override
	public ServerResponse deleteById(Integer id) {
		if (cusDevPlanMapper.deleteByPrimaryKey(id) > 0) {
			return ServerResponse.createSuccess("删除数据成功 ");
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

}