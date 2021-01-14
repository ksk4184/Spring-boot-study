package di1;

public class Car {
	private ChinaTire tire;
	public Car() {
		tire = new ChinaTire();
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di1");
	}

}
