package com.dao;

import java.util.List;
import com.vo.Car;

public interface CarDAO {
	public int insert(Car car);
	public int update(Car car);
	public int delete(int id);
	public Car selectById(int id);
	public List<Car> selectAll();
	public List<Car> selectByName(String name);
	public List<Car> selectByPrice(int price);

}
