package aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 3번 AOP를 적용하자
// xml(스프링컨테이너)에게 처리하도록 해서 AOP를 하자


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
		ApplicationContext context = new GenericXmlApplicationContext("aop3/applicationContext.xml");
		
		// 위빙 : 핵심관심사항과 공통관심사항을 하나로 묶는 방법
		// 부모타입으로 받아야 위빙이가능하다.
		// 위빙을 하려면 인터페이스 이어야만 한다.
		IPerson ip = context.getBean("boy",IPerson.class);
		try {
			ip.doSomething();
		} catch (Exception e) {
			System.out.println("e message : "+e.getMessage());
		}
	}
}
