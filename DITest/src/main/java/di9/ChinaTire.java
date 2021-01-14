package di9;

import org.springframework.stereotype.Component;

@Component("t") // 원하는 매개변수 이름과 같이 쓴다.
public class ChinaTire implements Tire{
	public String getName() {
		return "중국산 타이어";
	}
}
