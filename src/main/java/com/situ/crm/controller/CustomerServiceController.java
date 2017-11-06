package com.situ.crm.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.CustomerService;
import com.situ.crm.service.ICustomerServiceService;

@Controller
@RequestMapping("/customerService")
public class CustomerServiceController {
	@Autowired
	private ICustomerServiceService customerServiceService;
	

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }

	@RequestMapping("/index")
	public String index() {
		return "customer_service_manager";
	}
	@RequestMapping("/index1")
	public String index1() {
		return "customer_service_set_manager";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "customer_service_ass_manager";
	}
	@RequestMapping("/index3")
	public String index3() {
		return "customer_service_pro_manager";
	}
	@RequestMapping("/index4")
	public String index4() {
		return "customer_service_fee_manager";
	}
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService,Date beginTime,Date endTime) {
		return customerServiceService.findAll(page, rows, customerService,beginTime,endTime);
	}
	@RequestMapping("/findAll1")
	@ResponseBody
	public EasyUIDataGrideResult findAll1(Integer page, Integer rows, CustomerService customerService,Date beginTime,Date endTime) {
		return customerServiceService.findAll1(page, rows, customerService,beginTime,endTime);
	}
	@RequestMapping("/findAll2")
	@ResponseBody
	public EasyUIDataGrideResult findAll2(Integer page, Integer rows, CustomerService customerService,Date beginTime,Date endTime) {
		return customerServiceService.findAll2(page, rows, customerService,beginTime,endTime);
	}
	
	@RequestMapping("/findAll3")
	@ResponseBody
	public EasyUIDataGrideResult findAll3(Integer page, Integer rows, CustomerService customerService,Date beginTime,Date endTime) {
		return customerServiceService.findAll3(page, rows, customerService,beginTime,endTime);
	}
	@RequestMapping("delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerServiceService.delete(ids);
	}

	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerService customerService) {
		return customerServiceService.add(customerService);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerService customerService) {
		return customerServiceService.update(customerService);
	}
	
	
	@RequestMapping("/getServiceDealPeople")
	@ResponseBody
	public ServerResponse getServiceDealPeople(CustomerService customerService) {
		return customerServiceService.getServiceDealPeople(customerService);
	}
	
}