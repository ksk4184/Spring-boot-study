package dz10_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * di9 설정자 주입 -> diz10 복붙 diz z는 아무의미 없음. 가나다 순서 하려고
 *
 */

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// 자바 설정파일에서 설정정보를 읽어오기
//		KoreaTire tire = context.getBean("koreaTire",KoreaTire.class);
//		System.out.println(tire.getName());
//		
//		System.out.println(tire);
//		tire = context.getBean("koreaTire",KoreaTire.class);
//		System.out.println(tire);
		
		Car c = context.getBean("car", Car.class);
		c.drive();

		
		
		
	} // end of main
} // end of class
