package com.ssafy.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.model.dto.Product;
import com.ssafy.model.repository.ProductRepo;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired // 타입에 맞는 객체 생성까지 해줌?..
	ProductRepo repo;

	@Override
	public ProductRepo getRepo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectAll() {
		System.out.println("ProductServiceImpl selectAll 호출");
		repo.selectAll();
		return null;
	}

	@Override
	public Product select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
