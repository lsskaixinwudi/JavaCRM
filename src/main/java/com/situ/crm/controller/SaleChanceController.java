package com.situ.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.pojo.SaleChance;
import com.situ.crm.service.ISaleChanceService;

@Controller
@RequestMapping("/saleChance")
public class SaleChanceController {
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
 	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
 	    dateFormat.setLenient(false); 
 	    binder.registerCustomEditor(Date.class,
 	           new CustomDateEditor(dateFormat, true));
 	}
	@Autowired
	private ISaleChanceService saleChanceService;
	
	@RequestMapping("/index")
	public String index() {
		return "sale_chance_manage";
	}
	
	@RequestMapping("/cusDevPlan")
	public String cusDevPlan() {
		return "cus_dev_plan_manager";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, SaleChance saleChance,Date begindate,Date enddate) {
		return saleChanceService.findAll(page, rows, saleChance,begindate,enddate);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return saleChanceService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(SaleChance saleChance){
		/*Integer status = null;
		if(saleChance.getAssignMan()!=null){
			status = 1;
		}else{
			status = 0;
		}System.out.println(status);*/
		return saleChanceService.add(saleChance);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(SaleChance saleChance){
		return saleChanceService.update(saleChance);
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ServerResponse findById(Integer id) {
		return saleChanceService.findById(id);
	}
	
	@RequestMapping("/updateDevResult")
	@ResponseBody
	public ServerResponse updateDevResult(Integer saleChanceId, Integer devResult) {
		return saleChanceService.updateDevResult(saleChanceId, devResult);
	}
	
	@RequestMapping("/exportExcel")
	 	public void exportExcel(HttpServletResponse response) {
	 		try {
	 			/*//1、查找用户列表
	 			List<SaleChance> list = saleChanceService.findAll();
	 			//2、导出
	 */			response.setContentType("application/x-execl");
	 			response.setHeader("Content-Disposition", "attachment;filename=" + new String("用户列表.xls".getBytes(), "ISO-8859-1"));
	 			ServletOutputStream outputStream = response.getOutputStream();
	 			saleChanceService.exportExcel(outputStream);
	 			System.out.println(outputStream);
	 			if(outputStream != null){
	 				outputStream.close();
	 			}
	 		} catch (Exception e) {
	 			e.printStackTrace();
	 		}
	 	}
}
