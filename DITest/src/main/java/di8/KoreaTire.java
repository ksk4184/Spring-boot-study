package di8;

import org.springframework.stereotype.Component;

@Component // koreaTire로 component 자동 지정된다, 즉 scan대상이어서
// 스프링이 koreaTire를 로딩한다.
public class KoreaTire implements Tire{
	public String getName() {
		return "국산 타이어";
	}
}