package com.situ.crm.controller;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.Product;
import com.situ.crm.pojo.User;
import com.situ.crm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/index")
	public String index() {
		return "user_manager";
	}
	
	@RequestMapping(value="/login")
	public String login( HttpServletRequest req, String name, String password) {
		
		User user = userService.getUser(name,password);
		System.out.println(user);
		if (user != null) {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				System.out.println(user);
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
	public ServerResponse updateById(HttpServletRequest req, User user){
				System.out.println(user.getName());
				return userService.updateById(user);
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, User user) {
		return userService.findAll(page, rows, user);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return userService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(User user){
		return userService.add(user);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(User user){
		return userService.update(user);
	}
	
	@RequestMapping("/findUserName")
	@ResponseBody
	public List<User> findUserName() {
		return userService.findUserName();
	}
	
	
	@RequestMapping("/getCustomerManagerList")
	@ResponseBody
	public List<User> getCustomerManagerList() {
		return userService.getCustomerManagerList();
	}
	
	@RequestMapping("/exportExcel2")
 	public void exportExcel2(HttpServletResponse response) {
 		try {
 			/*//1、查找用户列表
 			List<SaleChance> list = saleChanceService.findAll();
 			//2、导出
 */			response.setContentType("application/x-execl");
 			response.setHeader("Content-Disposition", "attachment;filename=" + new String("用户信息列表.xls".getBytes(), "ISO-8859-1"));
 			ServletOutputStream outputStream = response.getOutputStream();
 			userService.exportExcel2(outputStream);
 			System.out.println(outputStream);
 			if(outputStream != null){
 				outputStream.close();
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
}
