package di3;

public class Car {
	private Tire tire;
/*	public Car(Tire t) {
		tire = t;
	}*/
	
	// setter로 주입받기 (개발자들이 조금더 선호)
	public void setTire(Tire t) {
		tire = t; // <용어> property injection 속성 주입
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di3");
	}
}
