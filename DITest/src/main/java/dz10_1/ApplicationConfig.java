package dz10_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//이 자바 파일은 설정파일이라는 것을 알려주어야 한다.
@Configuration // 이 자바파일은 설정 파일임
//@ComponentScan(basePackages = {"dz10_1"}) // 지정한 패키지의 모든 클래스를 스캔
@ComponentScan(basePackageClasses = {Car.class}) // 지정한 클래스가 속해있는 패키지 전체의 클래스를 스캔
public class ApplicationConfig {
	// 자바 설정파일을 이용해서 bean을 등록하기
	// 성식 : bean은 스프링컨테이너에서 사용할 객체를 의미
//	@Bean		// 객체관리를 받을 빈 객체임을 표시
//	public KoreaTire koreaTire() {	// 메서드명 koreaTire이 빈의 아이디
//		KoreaTire tire = new KoreaTire();
//		return tire;
//	}
//	
//	
//	@Bean
//	public Car car(Tire tire) {
//		Car c = new Car();
//		c.setTire(tire);
//		return c;
//	}
//	
	
	

}
