package ch07.unit3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex06_BigDecimal {

	public static void main(String[] args) {
		// BigDecimal : 아주 큰 실수를 다루기 위한 메소드, 필드를 제공하는 클래스
		
		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("3456.789");
		
//		BigDecimal c = a.divide(b); //런타임 오류. 소수점이 무한대로 계산되는 것이 아니기 때문에 터짐
		BigDecimal c = a.divide(b, RoundingMode.DOWN);
		System.out.println(c); //35714.297032146

		c = a.divide(b, 3, RoundingMode.DOWN); //소수점 이하 세 자리
		System.out.println(c); //35714.297
		
		System.out.println(a.toBigInteger());//BigInteger 객체로 변환 123456789
	}

}
