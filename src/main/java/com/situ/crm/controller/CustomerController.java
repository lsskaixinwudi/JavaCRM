package com.situ.crm.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.Product;
import com.situ.crm.pojo.Customer;
import com.situ.crm.service.ICustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

	@RequestMapping("/index")
	public String index() {
		return "customer_manager";
	}
	
	@RequestMapping(value="/login")
	public String login( HttpServletRequest req, String name, String password) {
		
		Customer customer = customerService.getCustomer(name,password);
		System.out.println(customer);
		if (customer != null) {
				HttpSession session = req.getSession();
				session.setAttribute("customer", customer);
				System.out.println(customer);
				return "redirect:/index/index.action";
			} else {
				return "redirect:/index/toLogin.action";
			}
		}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession(true);
		session.invalidate();
		return "redirect:/index/toLogin.action";
	}
	
	@RequestMapping("/updateById")
	@ResponseBody
	public ServerResponse updateById(HttpServletRequest req, Customer customer){
				System.out.println(customer.getName());
				return customerService.updateById(customer);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, Customer customer) {
		return customerService.findAll(page, rows, customer);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return customerService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(Customer customer){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateStr = simpleDateFormat.format(date);
		String num = new String("KH"+dateStr);
		
		customer.setNum(num);
		
		
		return customerService.add(customer);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(Customer customer){
		return customerService.update(customer);
	}
	
	@RequestMapping("/findCustomerNum")
	@ResponseBody
	public List<Customer> findCustomerNum() {
		return customerService.findCustomerNum();
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ServerResponse findById(Integer id) {
		return customerService.findById(id);
	}
	
}
