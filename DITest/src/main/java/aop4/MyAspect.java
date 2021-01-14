package aop4;

import org.aspectj.lang.JoinPoint;

/**
 * 
 * 각각의 공통 관심사항을 시점별로 함수로 나눠서 구현하기
 *
 */
public class MyAspect {
	public void doBefore(JoinPoint pt) { // 핵심 관심사항 실행전
		// 일반 메서드도 한번 실행해보고 싶다면,
		// 객체 자체는 스프링 컨테이너가 관리하기때문에
		// boy로 들어왔는지, girl로 들어왔는지 아직 모름
		
		// 그래서 매개변수로 JoinPoint를 제공해주고 있음
		Object o = pt.getTarget();
		if(o instanceof Boy) {
			Boy b = (Boy)o;
			b.hello(); // Boy객체로 들어왔을경우 Boy객체가 가지고 있는 일반 메서드를 실행
		}
		
		System.out.println("문을 열고 집에 들어감");
	}
	
	// 이쪽파트에선
	/////////// 핵심관심사항 실행
	
	public void doAfterReturning(String rt) { // 핵심 정상실행후, 핵심관심사항에 매개변수가 있을 때 그것을 저장
		System.out.println("불끄고 잔다");
	}
	
	public void doAfterThrowing(Throwable th) { // 핵심 실행 예외발생, 예외발생시점의 객체를 매개변수로 등록
		System.out.println(th.getMessage() + " : 119에 신고한다");
	}
	
	public void doAfter() { // finally
		System.out.println("문을 열고 나온다");
	}
}