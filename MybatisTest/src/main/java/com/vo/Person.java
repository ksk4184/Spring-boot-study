package com.vo;

/**
 * 
 * VO 객체
 * Getter/Setter, toString 구현
 * 테이블의 컬럼명과 필드명을 동일하게 만들어주는게 편리하다
 * 
 * 데이터베이스 명, 계정/비번, 테이블명, 테이블생성(컬럼명, 타입) autoIncrement도 맞춰서 설정해주어야한다.!!
 * 
 * mydb (데이터베이스명)
 * 
 *
 */
public class Person {
	private int id;
	private String name;
	
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
