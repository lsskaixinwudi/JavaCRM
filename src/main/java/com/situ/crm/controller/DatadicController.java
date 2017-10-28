package com.situ.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.Datadic;
import com.situ.crm.service.IDatadicService;

@Controller
@RequestMapping("/datadic")
public class DatadicController {
	@Autowired
	private IDatadicService datadicService;

	@RequestMapping("/index")
	public String index() {
		return "datadic_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, Datadic datadic) {
		return datadicService.findAll(page, rows, datadic);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return datadicService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(Datadic datadic){
		return datadicService.add(datadic);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(Datadic datadic){
		return datadicService.update(datadic);
	}
	
}
