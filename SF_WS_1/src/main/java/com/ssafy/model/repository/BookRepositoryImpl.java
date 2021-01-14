package com.ssafy.model.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ssafy.model.dto.Book;

/*
 * @Component 어노테이션의 자식 3개
 * 
* @Repository : 영속성(Persistence)을 가지는 레이어, 파일, DB 등 저장
* @Service : 서비스 레이어
* @Controller : 프레젠테이션 레이어
*
 * 
 */


@Repository // 스캔 대상으로 표시
public class BookRepositoryImpl implements BookRepository{

	@Override
	public int insert(Book book) {
		return 0;
	}

	@Override
	public int update(Book book) {
		return 0;
	}

	@Override
	public int delete(Book book) {
		return 0;
	}

	@Override
	public Book select(Book book) {
		return null;
	}

	@Override
	public List<Book> selectAll() {
		System.out.println("BookRepositoryImpl의 SelectAll() 메서드");
		return null;
	}
}
