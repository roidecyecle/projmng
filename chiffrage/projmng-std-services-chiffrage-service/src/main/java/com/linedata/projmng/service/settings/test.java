package com.linedata.projmng.service.settings;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linedata.projmng.bean.chiffrage.EstimationBean;
import com.linedata.projmng.bean.chiffrage.Status;
import com.linedata.projmng.bean.chiffrage.UnitOfWorkBean;
import com.linedata.projmng.service.api.chiffrage.EstimationService;
import com.linedata.projmng.service.api.chiffrage.UnitOfWorkService;
import com.linedata.projmng.service.api.settings.SettingSubjectService;



public abstract class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
		SettingSubjectService service = (SettingSubjectService) ctx.getBean("SettingSubjectService");
		
		UnitOfWorkService service1 = (UnitOfWorkService) ctx.getBean("UnitOfWorkService");
		EstimationService service2 = (EstimationService) ctx.getBean("EstimationService");
		
		
		
		
	
		System.out.println(service2.getCostByEstimation(482));
		
		
		
		
		
		
		

	}

}
