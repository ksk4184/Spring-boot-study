package di2;

public class Car {
	private Tire tire;
	public Car(Tire t) {
		tire = t;
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di2");
	}
}
