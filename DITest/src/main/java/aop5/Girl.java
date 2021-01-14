package aop5;

import java.util.Random;

public class Girl implements IPerson{
	public String doSomething() throws Exception {
		System.out.println("드라마를 본다");
		Random ran = new Random();
		boolean r = ran.nextBoolean();
		if(r) {
			throw new Exception("화재발생");
		}
		return "I'm a girl";
	}

}
