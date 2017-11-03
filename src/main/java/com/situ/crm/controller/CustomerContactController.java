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
import com.situ.crm.pojo.CustomerContact;
import com.situ.crm.service.ICustomerContactService;

@Controller
@RequestMapping("/customerContact")
public class CustomerContactController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }

	
	@Autowired
	private ICustomerContactService customerContactService;

	@RequestMapping("/index")
	public String index() {
		return "customer_contact_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerContact customerContact) {
		return customerContactService.findAll(page, rows, customerContact);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerContactService.delete(ids);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public ServerResponse deleteById(Integer id) {
		return customerContactService.deleteById(id);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerContact customerContact) {
		return customerContactService.add(customerContact);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerContact customerContact) {
		return customerContactService.update(customerContact);
	}
	
}