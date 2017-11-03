package com.situ.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.SSLEngineResult.Status;

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
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
 	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
 	    dateFormat.setLenient(false); 
 	    binder.registerCustomEditor(Date.class,
 	           new CustomDateEditor(dateFormat, true));
 	}
	@Autowired
	private ICustomerServiceService customerServiceService;
	
	@RequestMapping("/index")
	public String index() {
		return "customer_service_manager";
	}
	
	@RequestMapping("/cusDevPlan")
	public String cusDevPlan() {
		return "cus_dev_plan_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerService customerService,Date begindate,Date enddate) {
		return customerServiceService.findAll(page, rows, customerService,begindate,enddate);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerServiceService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerService customerService){
		/*Integer status = null;
		if(customerService.getAssignMan()!=null){
			status = 1;
		}else{
			status = 0;
		}System.out.println(status);*/
		System.out.println(customerService.getCreatePeople());
		System.out.println(customerService.getStatus());
		return customerServiceService.add(customerService);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerService customerService){
		return customerServiceService.update(customerService);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ServerResponse findById(Integer id) {
		return customerServiceService.findById(id);
	}   
	
	/*@RequestMapping("/updateDevResult")
	@ResponseBody
	public ServerResponse updateDevResult(Integer customerServiceId, Integer devResult) {
		return customerServiceService.updateDevResult(customerServiceId, devResult);
	}*/
}
