package di9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Tire tire;
	
/*	public Car(Tire t) {
		tire = t;
	}*/
	
	// 보통은 setter메서드에다가 쓴다.
	// Tire 변수에다가도 쓰긴 하는데
	// setter로 주입받기 (개발자들이 조금더 선호)
	
	@Autowired	// setter 앞에 필요한 객체를 알아서 주입해라
	// NoSuchBeanDefinitionException : 맞는 타입의 빈 객체를 찾지 못했을 때
	// NoUniqueBeanDefinitionException : 맞는 타입의 빈 객체가 두개 이상일 때
	// (required=false) => 빈 객체를 찾지 못해도 그냥 계속 진행한다.
	@Qualifier("koreaTire") // 매칭되는 타입의 빈이 두 개이상일 때 빈의 id로 원하는 객체를 지정 
							// 매칭되는 타입의 빈이 두개 이상이지만, @Qualifier 없을때, setter의 변수명과 같은 id 빈 객체를 사용
	// 결론 : Qualifier를 쓴다.
	public void setTire(Tire t) {
		tire = t; // <용어> property injection 속성 주입
	}
	
	public void drive() {
		System.out.println(tire.getName()+"로 굴러가는 자동차 di3");
	}
}
