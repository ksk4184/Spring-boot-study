package aop5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 한줄요약
// AOP4번 프로젝트를 doAround 메서드를 이용해서 4개로 나뉘는게 아닌 한가지 메서드로 처리해보자.

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
		ApplicationContext context = new GenericXmlApplicationContext("aop5/applicationContext.xml");
		
		IPerson ip = context.getBean("boy",IPerson.class);
		
		try {
			ip.doSomething();
		} catch (Exception e) {
			
		}
		
	}
}
