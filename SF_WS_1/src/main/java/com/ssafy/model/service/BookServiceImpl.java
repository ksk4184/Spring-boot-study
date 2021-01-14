package com.ssafy.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.model.dto.Book;
import com.ssafy.model.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired	// 타입에 맞는 필요한 객체를 알아서 넣어달라는 태그
	private BookRepository bookRepo;
	
	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int select(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> selectAll() {
		System.out.println("bookRepo 의 SelectAll");
		bookRepo.selectAll();
		return null;
	}

}
