package ch06.unit4;

public class Ex22_final {

	public static void main(String[] args) {
//		Sample2.PI=10; //final 상수 값 변경 불가
		
		System.out.println(Sample2.PI);
		
		Sample2.a=50; //final 변수 아니라 값 변경 가능.
		
		Sample2 ss = new Sample2();
		System.out.println(ss.b); // final 변수라서 값 변경 불가
		System.out.println(ss.c); // final 변수라서 값 변경 불가
	}

}

class Sample2 {
	public static int a= 10;
	
	//final 변수 : 한번만 초기화가 가능하며, 값을 변경 할 수 없다.
	//구분하기 위해서 변수명을 대문자로 줌
	public final static double PI = 3.141592;
	
	public final static int x;
	static { //static 초기화 블럭에서 final static 변수의 초기화는 가능.
		x=5; 
	}
	
	//인스턴스 final 변수는 초기화 수식, 초기화 블럭, 생산자에서 초기화 가능
	final int b=10;
	final int c;
	
	public Sample2() {
//		x=5; //final static 변수는 생성자에서 초기화가 불가능
		c=10; //final 인스턴스 변수는 생성자에서 초기화 가능.
	}
	
	public void sub() {
		//c=10; //컴파일 오류. final 변수는 일반 메소드에서 값을 변경 할 수 없다.
	}
	
}