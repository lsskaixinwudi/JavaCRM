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
	private SaleChanceMapper salechanceMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, SaleChance salechance, Date begindate, Date enddate) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		SaleChanceExample salechanceExample = new SaleChanceExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = salechanceExample.createCriteria();
		if (StringUtils.isNotEmpty(salechance.getCustomerName())) {
			createCriteria.andCustomerNameLike(Util.formatLike(salechance.getCustomerName()));
		}
		if (StringUtils.isNotEmpty(salechance.getCreateMan())) {
			createCriteria.andCreateManLike(Util.formatLike(salechance.getCreateMan()));
		}
		if (salechance.getStatus() != null) {
			createCriteria.andStatusEqualTo(salechance.getStatus());
		}
		if (salechance.getDevResult() != null) {
			createCriteria.andDevResultEqualTo(salechance.getDevResult());
		}
		if (begindate !=null && enddate != null) {
			createCriteria.andCreateTimeBetween(begindate, enddate);
		}
		List<SaleChance> salechanceList = salechanceMapper.selectByExample(salechanceExample);
		//total
		PageInfo<SaleChance> pageInfo = new PageInfo<>(salechanceList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(salechanceList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			salechanceMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(SaleChance salechance) {
		if(StringUtils.isNotEmpty(salechance.getAssignMan())){
			salechance.setStatus(1);
		}else{
			salechance.setStatus(0);
		}
		if(salechanceMapper.insert(salechance)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(SaleChance salechance) {
		if(salechanceMapper.updateByPrimaryKey(salechance)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}


}
