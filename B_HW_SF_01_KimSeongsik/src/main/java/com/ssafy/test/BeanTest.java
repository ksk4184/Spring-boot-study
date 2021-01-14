package com.ssafy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ssafy.config.ApplicationConfig;
import com.ssafy.model.repository.ProductRepo;
import com.ssafy.model.service.ProductService;

public class BeanTest {
	static ApplicationContext ctx;
	static ProductService service;
	ProductRepo repo;
	
	public void testRepository() {
		
	}
	
	public void testService() {
		
	}
	
	public void auditTest() {
	
	}
	
	public static void main(String[] args) {
		
		ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		service = ctx.getBean("productService",ProductService.class);
		service.selectAll();
		
	}
	

}
