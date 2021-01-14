package aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


// aop4번 : aop3번에서 각 메서드의 리턴결과를 받아서 그것을 활용하는 케이스




/*
AOP : 관점에 따라 구분
핵심 관심사항
공통 관심사항을 분리해서 구분하자
OOP 단점을 보완하자! AOP를 통해서 핵심관심사항과 공통 관심사항을 분리해서 구현하자!

나머진 공통

공통관심사항 적용할 코드 + 적용지점(Pointcut)
Pointcut - AOP 구성을 위해서 지정한 위치
Aspect : AOP 구현체
*/


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("aop4/applicationContext.xml");
		
		IPerson ip = context.getBean("boy",IPerson.class);
		try {
			String str = ip.doSomething();
			System.out.println("결과 : " + str);
		} catch (Exception e) {
			
		}
	}
}
