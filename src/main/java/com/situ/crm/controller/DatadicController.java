package com.situ.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.DataDic;
import com.situ.crm.service.IDataDicService;

@Controller
@RequestMapping("/datadic")
public class DatadicController {
	@Autowired
	private IDataDicService datadicService;

	@RequestMapping("/index")
	public String index() {
		return "data_dic_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, DataDic datadic) {
		return datadicService.findAll(page, rows, datadic);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return datadicService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(DataDic datadic){
		return datadicService.add(datadic);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(DataDic datadic){
		return datadicService.update(datadic);
	}
	
	@RequestMapping("/findDataDicName")
	@ResponseBody
	public List<DataDic> findDataDicName() {
		return datadicService.findDataDicName();
	}
	
	@RequestMapping("/findDataDicValue")
	@ResponseBody
	public List<DataDic> findDataDicValue() {
		return datadicService.findDataDicValue();
	}
	
}
