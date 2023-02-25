package ch06.unit3;

public class Ex12_overloading {

	public static void main(String[] args) {
		Test12 t = new Test12();
		
		short a = 10;
		t.print(a);// short형이 매개변수인 print를 찾게 됨-> int로 출력
		           // 기본 데이터 타입은 매개변수 타입이  동일한 기본데이터 메서드 호출
		           // 동일한 타입이 없으면 큰 기본데이터 타입 중 가장 가까운 메소드를 호출
		
		char c = 'A';
		t.print(c);// int 메서드 호출
		
		long b = 10;
		t.print(b);//Long 
		           // 기본 데이터 타입을 매개변수 타입이 처리가 불가능한 경우, Wrapper Class 로 처리 가능하면 해당 메소드 호출 
		
	}

}
//overloading : 메소드의 이름은 같지만 매개변수의 개수가 다르거나 매개변수 타입이 다른 경우(반환타입은 상관 없음)
class Test12 {
	public void print() {
		System.out.println("인자 없는 메소드");
	}

/*	반환 타입만 다른 것은 컴파일 오류. overloading 아님
	public void print() {
		return 1;
	}
*/	
	public void print(byte a) {
		System.out.println("byte : "+a);
	}

/*
	public void print(short a) {
		System.out.println("short : "+a);
	}
*/	
	public void print(int a) {
		System.out.println("int : "+a);
	}
	
	//Wrapper Class
	// -기본형 데이터를 객체로 처리할 수 있도록 클래스를 제공
	// -Byte, Short, Integer, Long, Float, Double, Character 등
	public void print(Short a) {
		System.out.println("Short : "+a);
	}

	public void print(Long a) {
		System.out.println("Long : "+ a);
	}
	
}