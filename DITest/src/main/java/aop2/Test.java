package aop2;

// 2번 프록시패턴

public class Test {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
//		boy.doSomething(); // 직접 부르는게 아니라
		// 대행자를 통해서 불러보겠다.
		PersonProxy proxy = new PersonProxy();
		proxy.setPerson(boy);
		proxy.doSomething();
	}
}
// 1. 원하는 기능의 원형을 가지는 인터페이스를 정의
// 2. 인터페이스를 상속 구현해서 원하는 실제 기능을 작성
// 3. 1의 객체 기능을 호출하는 클래스 대행자를 만든다.


