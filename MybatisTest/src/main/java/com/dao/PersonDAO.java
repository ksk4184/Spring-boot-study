package com.dao;

import java.util.List;

import com.vo.Person;

/**
 * 
 * PersonMapper 에 있는 쿼리정보와 1:1 매칭하는 짝쿵클래스
 *
 */
public interface PersonDAO {
	public int insert(Person person); // 삽입
	public void update(Person person); // 업데이트
	public void delete(int id); // 삭제
	public List<Person> selectAll();
	public Person selectById(int id);
	public List<Person> selectByName(String name);
}
