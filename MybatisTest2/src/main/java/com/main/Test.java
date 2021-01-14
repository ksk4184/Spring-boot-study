package com.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dao.CarDAO;
import com.mybatis.MybatisConnectionFactory;
import com.vo.Car;

public class Test {

	private static CarDAO carDAO;
	private static List<Car> clist;

	public static void main(String[] args) {
		SqlSession sqlSession = MybatisConnectionFactory.getSqlSessionFactory().openSession(true);
		carDAO = sqlSession.getMapper(CarDAO.class);
		
		
		System.out.println("=============selectAll");
		print();
		
		Car car = new Car();
//		System.out.println("=============Insert");
//		car = new Car();
//		car.setName("LG_1");
//		car.setManufacturer("HYUNDAI");
//		car.setPrice(50000);
//		carDAO.insert(car);
//		print();
		
		System.out.println("=============Update");
		car = new Car();
		car.setId(3);
		car.setName("ABC_CAR");
		car.setManufacturer("HYUNDAI");
		car.setPrice(45000);
		carDAO.update(car);
		print();
		
		System.out.println("=============selectById(1)");
		Car ca = carDAO.selectById(1);
		System.out.println("id\tName\tManufacturer\tPrice");
		System.out.println(ca.getId()+"\t"+
				ca.getName()+"\t"+
				ca.getManufacturer()+"\t\t"+
				ca.getPrice());

		
		System.out.println("=============selectByName(LG)");
		clist = carDAO.selectByName("LG");
		System.out.println("id\tName\tManufacturer\tPrice");
		for (Car c : clist) {
			System.out.println(c.getId()+"\t"+
					c.getName()+"\t"+
					c.getManufacturer()+"\t\t"+
					c.getPrice());
		}
		
		System.out.println("=============selectByPrice(40000)");
		clist = carDAO.selectByPrice(40000);
		System.out.println("id\tName\tManufacturer\tPrice");
		for (Car c : clist) {
			System.out.println(c.getId()+"\t"+
					c.getName()+"\t"+
					c.getManufacturer()+"\t\t"+
					c.getPrice());
		}
		
	    Logger logger = LoggerFactory.getLogger(Test.class);
	    
	    logger.trace("Hello world.");
	    logger.debug("Hello world."); //debug level로 해당 메시지의 로그를 찍겠다.
	    logger.info("Hello world.");
	    logger.warn("Hello world.");
	    logger.error("Hello world.");
	}
	
	
	public static void print() {
		clist = carDAO.selectAll();
		System.out.println("id\tName\tManufacturer\tPrice");
		for (Car car : clist) {
			System.out.println(car.getId()+"\t"+
					car.getName()+"\t"+
					car.getManufacturer()+"\t\t"+
					car.getPrice());
		}
	}
}
