package com.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.validation.MessageCodeFormatter;

import com.dao.PersonDAO;
import com.mybatis.MybatisConnectionFactory;
import com.vo.Person;

public class Test {
	public static void main(String[] args) {
		// 1. 세션연결
		SqlSession sqlSession = MybatisConnectionFactory.getSqlSessionFactory().openSession(true);
			// true : 오토커밋, false : 수동커밋
		
		// false를 한다고 바로 수동커밋이 되는 것이 아니다.
		// 1. config.xml파일에서 <transactionManger type>을 바꾸어야만 한다.
		// openSession(false);로 했을 경우 수동커밋이 된다.
		
		// 2. Mapper 연결
		// PersonDAO는 Interface이다. 실제로 interface를 구현한 객체는 없다.
		// getMapper를 설정하면 person 인터페이스 객체가 하나 생성된다.
		PersonDAO personDAO = sqlSession.getMapper(PersonDAO.class);
		
		// 3. 쿼리 실행
		List<Person> plist = personDAO.selectAll();
		
		for (Person person : plist) {
			System.out.println(person.toString());
		}
		
		Person p;
		// selectById 하나의 아이디로 조회하는 방법
		System.out.println("------selectById(1)");
		p = personDAO.selectById(1);
		System.out.println(p.toString());
		

		
		
		// insert
		Person p3 = new Person();
		p3.setName("손흥민");
		personDAO.insert(p3);
		System.out.println("insert 후 id : " + p3.getId());
		
		// update
//		System.out.println("--------update---------");
//		Person p2 = new Person();
//		p2.setId(4);
//		p2.setName("류현진");
//		personDAO.update(p2);
//		plist = personDAO.selectAll();
//		
//		for (Person person : plist) {
//			System.out.println(person.toString());
//		}
		
		// delete
//		System.out.println("--------delete---------");
//		personDAO.delete(5);
//		plist = personDAO.selectAll();
//		
//		for (Person person : plist) {
//			System.out.println(person.toString());
//		}
		
		
		// selectByName 이름으로 검색할 수 있도록 구현
		System.out.println("------selectByName(\"류현진\")------");
		plist = personDAO.selectByName("손흥민");
		System.out.println("id" + "\t" + "name");
		for (Person person : plist) {
			System.out.println(person.getId() + "\t" + person.getName());
		}
		
		
		// 수동 커밋일 경우
		// 트랜잭션 관리가 가능하다.
		// 저장할지(commit), 취소할지(rollback)
		sqlSession.rollback();
		
		// 4. 트랜잭션 마무리
		

	} // end of main
}
