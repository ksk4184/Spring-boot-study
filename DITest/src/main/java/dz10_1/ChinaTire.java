package dz10_1;

import org.springframework.stereotype.Component;

@Component
public class ChinaTire implements Tire{
	public String getName() {
		return "중국산 타이어";
	}
}
