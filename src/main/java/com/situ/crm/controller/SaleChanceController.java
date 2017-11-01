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
import com.situ.crm.pojo.SaleChance;
import com.situ.crm.service.ISaleChanceService;

@Controller
@RequestMapping("/salechance")
public class SaleChanceController {
	@InitBinder 
	public void initBinder(WebDataBinder binder) { 
 	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
 	    dateFormat.setLenient(false); 
 	    binder.registerCustomEditor(Date.class,
 	           new CustomDateEditor(dateFormat, true));
 	}
	@Autowired
	private ISaleChanceService salechanceService;
	
	@RequestMapping("/index")
	public String index() {
		return "sale_chance_manage";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, SaleChance salechance,Date begindate,Date enddate) {
		return salechanceService.findAll(page, rows, salechance,begindate,enddate);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ServerResponse delete(String ids) {
		return salechanceService.delete(ids);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ServerResponse add(SaleChance salechance){
		/*Integer status = null;
		if(salechance.getAssignMan()!=null){
			status = 1;
		}else{
			status = 0;
		}System.out.println(status);*/
		return salechanceService.add(salechance);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ServerResponse update(SaleChance salechance){
		return salechanceService.update(salechance);
	}
	
}
