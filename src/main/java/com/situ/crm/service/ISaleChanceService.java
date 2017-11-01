package com.situ.crm.service;

import java.util.Date;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.SaleChance;

public interface ISaleChanceService {

	EasyUIDataGrideResult findAll(Integer page, Integer rows, SaleChance salechance, Date begindate, Date enddate);

	ServerResponse delete(String ids);

	ServerResponse add(SaleChance salechance);

	ServerResponse update(SaleChance salechance);

}
