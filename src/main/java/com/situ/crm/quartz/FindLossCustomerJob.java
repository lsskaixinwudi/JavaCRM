package com.situ.crm.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.situ.crm.dao.CustomerLossMapper;
import com.situ.crm.service.ICustomerLossService;
import com.situ.crm.service.ICustomerService;

/**
 * 
 *查找流失客户的定时任务
 */
@Component
public class FindLossCustomerJob {
	@Autowired
	private ICustomerService customerService;
	
	/**
	 * 每天凌晨2点执行这个定时任务
	 */
	//@Scheduled(cron="0 0 2 * * ?")
	@Scheduled(cron="0 15 10 * * ?")
	public void work() {
		System.out.println("FindLossCustomerJob.work()");
		customerService.checkCustomerLoss();
	}
}