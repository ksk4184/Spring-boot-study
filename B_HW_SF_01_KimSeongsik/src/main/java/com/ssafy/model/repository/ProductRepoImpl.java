package com.ssafy.model.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ssafy.model.dto.Product;

@Repository
public class ProductRepoImpl implements ProductRepo{

	@Override
	public List<Product> selectAll() {
		System.out.println("ProductRepoImpl selectAll 호출");
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
