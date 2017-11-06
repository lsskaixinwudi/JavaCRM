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
import com.situ.crm.pojo.CustomerLoss;
import com.situ.crm.service.ICustomerLossService;

@Controller
@RequestMapping("/customerLoss")
public class CustomerLossController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }

	
	@Autowired
	private ICustomerLossService customerLossService;

	@RequestMapping("/index")
	public String index() {
		return "customer_loss_manager";
	}
	
	@RequestMapping("/index2")
	public String index2() {
		return "customer_loss_manager2";
	}
	
	@RequestMapping("/customerLosss")
	public String customerLossLoss() {
		return "customer_loss_measure_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerLoss customerLoss,Date beginTime,Date endTime) {
		return customerLossService.findAll(page, rows, customerLoss,beginTime,endTime);
	}
	
	@RequestMapping("/findAll2")
	@ResponseBody
	public EasyUIDataGrideResult findAll2(Integer page, Integer rows, CustomerLoss customerLoss) {
		System.out.println(page + "+" + rows);
		return customerLossService.findAll2(page, rows, customerLoss);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerLossService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerLoss customerLoss) {
		return customerLossService.add(customerLoss);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerLoss customerLoss) {
		return customerLossService.update(customerLoss);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ServerResponse findById(Integer id) {
		return customerLossService.findById(id);
	}
	

	@RequestMapping("/updateStatus")
	@ResponseBody
	public ServerResponse updateStatus(Integer id, Integer status) {
		return customerLossService.updateStatus(id, status);
	}
}