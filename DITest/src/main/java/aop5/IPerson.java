package aop5;

//AOP모습으로 가기위해 인터페이스를 원형으로 만들었다.
public interface IPerson {
	public String doSomething() throws Exception; // 애노테이션 기법을 쓰려면 Exception을 등록해줘야함
}
