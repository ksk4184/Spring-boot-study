package com.ssafy.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ssafy.config.ApplicationConfig;
import com.ssafy.model.repository.BookRepositoryImpl;
import com.ssafy.model.service.BookService;
import com.ssafy.model.service.BookServiceImpl;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//BookRepositoryImpl b = context.getBean("bookRepositoryImpl",BookRepositoryImpl.class);
		BookService bs = context.getBean("bookService",BookServiceImpl.class);
		
		bs.selectAll();
		
		//BookService c = context.getBean("bookService",BookServiceImpl.class);
		
		
		
		
	}
}
