package di7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("c")			// 이 애노테이션이 붙어있는 class는 Bean으로 자동으로 등록이 된다. ("c") id값을 지정할 수 있음
// 지젖ㅇ하지 않으면 "car" 클래스명의 첫글자를 소문자를 바꾼 이름이 id 가 된다. 즉 car가 id가 됨
public class Car {
	private ChinaTire tire;
	public Car() {
		tire = new ChinaTire();
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di7");
	}
	
	@PostConstruct
	public void 마이init() {
		System.out.println("초기화 메서드");
	}
	
	@PreDestroy
	public void 마이destroy() {
		System.out.println("소멸자 메서드");
	}

}
