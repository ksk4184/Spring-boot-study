package di4_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//di4_1 : d4 복사함
//초기화 메서드, 소멸메서드를 지정

public class Test {
	
	public static void main(String[] args) {
//		xml 설정파일을 작성
//		자바코드에서 xml 설정파일을 매개로 해서
//		ApplicationContext 객체를 생성
//		컨테이너 객체로부터 bean 객체를 얻어다 쓰기

// 		Car c = new Car(); //객체 생성을 스프링이 대신 해줌.
		ApplicationContext context = new GenericXmlApplicationContext("di4_1/applicationContext.xml");
		//Car c = (Car)context.getBean("c"); // 변수명을 통해서 객체를 얻어옴, 직접 형변환 하는 방법
		Car c = context.getBean("c", Car.class); // 지정한 클래스 정보를 함께 넘겨줌, 이 행을 더 많이씀!--
		c.drive();
		
		Car c2 = context.getBean("c", Car.class); // 싱글톤 패턴을 기본적으로 하고 있음
		c2.drive();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c == c2); // true\
		
		// 객체를 소멸시키고 싶으면 
		// 컨테이너를 닫으면된다.
		
		// 컨테이너를 닫으면 빈 객체가 소멸한다.
		((GenericXmlApplicationContext)context).close(); // 컨테이너 닫기
		// ApplicationContext 인터페이스에는 닫는 메서드를 선언하지 않음
		// GenericXmlApplicationContext 클래스에 닫는 메서드를 선언해 놓음
		
		
	} // end of main
} // end of class

// 소스코드의 들어가는 코드를 모두 제거하고,
// 의존성이 꼭 들어가야하는 코드는 한 곳에 몰아놓음(스프링컨테이너)
// 그러한 역할을 스프링 컨테이너가 함 그것을 IoC(제어역전)이라고 함.

// 우리는 내맘대로 작업을 했지만 그렇게 짜면 뭐하나 수정하면 다 바꿔야함
// 그래서 그러한 구조를 바꾸고 좀더 효율적으로 구현할 수 있도록 하는 것이 스프링

// 1.생성자, 2.setter  2가지 방법이 있다.

// 스프링 컨테이너 기존 객체관리 정책
// 컨테이너 생성시 자신이 포함할 빈 객체를 모두 생성
// 그리고 컨테이너가 제거될 때 자기가 만들어 놓은 빈 객체를 모두 제거하고 죽음

/*

BeanFactory : 객체 생성과 검색에 대한 기능을 정의, 싱글톤/프로토타입의 bean인지 여부를 확인하는 기능
|
ApplicationContext : 메시지, 이벤트, 환경변수 처리 기능
|
GenericXmlApplicationContext, AnnotationContigApplicationContext, GenericGroovyApplicationContext
xml로 부터 설정정보를 가져옴,			자바 애노테이션을 이용해 클래스로부터 정보 가져옴,	그루비 코드를 이용해서 정보가져옴


*/
