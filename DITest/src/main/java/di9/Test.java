package di9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 
 * di3 ==> di9복사
 * 
 *
 */

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di9/applicationContext.xml");
		Car c = context.getBean("car",Car.class); // id를 지정안했으므로 car
		c.drive();
		
	} // end of main
} // end of class
