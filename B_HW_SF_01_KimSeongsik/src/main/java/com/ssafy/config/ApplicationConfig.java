package com.ssafy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ssafy.model.repository.ProductRepo;
import com.ssafy.model.service.ProductService;


@Configuration	// 설정파일임을 표시
@ComponentScan(basePackageClasses = {ProductService.class, ProductRepo.class}) // 패키지를 스캔
public class ApplicationConfig {

}
