package ch07.unit3;

import java.math.BigInteger;
//Math 클래스

public class Ex05_BigInteger {

	public static void main(String[] args) {
		// BigInteger : 아주 큰 정수를 다루기 위한 메소드, 필드를 제공하는 클래스
		
		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789123456789");
		
		BigInteger c = a.add(b); //덧셈
		System.out.println("c: "+c); //c: 246913578246913578246913578
		
		BigInteger d = a.multiply(b); //곱셈
		System.out.println(d); //15241578780673678546105778281054720515622620750190521
		
		BigInteger e = a.divide(b); //나눗셈
		System.out.println(e); //1
		
		BigInteger f = a.pow(2);
		System.out.println(f); //15241578780673678546105778281054720515622620750190521

	}

}
