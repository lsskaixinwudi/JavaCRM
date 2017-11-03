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
import com.situ.crm.pojo.CustomerOrder;
import com.situ.crm.service.ICustomerOrderService;

@Controller
@RequestMapping("/customerOrder")
public class CustomerOrderController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }

	
	@Autowired
	private ICustomerOrderService customerOrderService;

	@RequestMapping("/index")
	public String index() {
		return "customer_order_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, CustomerOrder customerOrder) {
		return customerOrderService.findAll(page, rows, customerOrder);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerOrderService.delete(ids);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public ServerResponse deleteById(Integer id) {
		return customerOrderService.deleteById(id);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(CustomerOrder customerOrder) {
		return customerOrderService.add(customerOrder);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(CustomerOrder customerOrder) {
		return customerOrderService.update(customerOrder);
	}
	
}