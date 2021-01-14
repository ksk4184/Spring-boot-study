package di8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Tire tire;
	
	// 거기서 맞는 t를 알아서 넣어달라 라는 의미
	@Autowired // 객체 생성 시 필요한 매개변수를 타입에 맞는 것을 찾아 알아서 지정해줌.
	// 필요한 타입이랑 맞는 타입의 Bean이 등록되지 않알 을 때 NoSuchBeanDefinitionException
	public Car(Tire t) {
		tire = t;
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di2");
	}
}
