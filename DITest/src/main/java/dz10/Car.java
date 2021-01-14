package dz10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Car {
	private Tire tire;
	
	public void setTire(Tire t) {
		tire = t; // <용어> property injection 속성 주입
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di3");
	}
}
