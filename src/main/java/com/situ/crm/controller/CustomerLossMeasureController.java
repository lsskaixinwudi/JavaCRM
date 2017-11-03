package com.situ.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerLossMeasure;
import com.situ.crm.service.ICustomerLossMeasureService;

@Controller
@RequestMapping("/customerLossMeasure")
public class CustomerLossMeasureController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }     

	
	@Autowired
	private ICustomerLossMeasureService customerLossMeasureService;

	@RequestMapping("/index")
	public String index() {
		return "customer_loss_measure_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLossMeasure customerLossMeasure,Date beginTime,Date endTime) {
		return customerLossMeasureService.findAll(page, rows, customerLossMeasure,beginTime,endTime);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerLossMeasureService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerLossMeasure customerLossMeasure) {
		return customerLossMeasureService.add(customerLossMeasure);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerLossMeasure customerLossMeasure) {
		return customerLossMeasureService.update(customerLossMeasure);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ServerResponse findById(Integer id) {
		return customerLossMeasureService.findById(id);
	}
	

	@RequestMapping("/updateDevResult")
	@ResponseBody
	public ServerResponse updateDevResult(Integer customerLossMeasureId, Integer devResult) {
		return customerLossMeasureService.updateDevResult(customerLossMeasureId, devResult);
	}
}