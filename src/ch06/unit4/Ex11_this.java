package ch06.unit4;

public class Ex11_this {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		obj.set(50); //매개변수 a에 50을 넣음.
		obj.print(); //a: 0, b: 100, c: 100
		obj.write(); //a: 0, b: 100, c: 5
	}

}
//필드와 지역변수, 매개변수명이 동일하면 지역변수가 우선 순위로 연산
class Demo1 { 
	private int a; //필드 a, 0으로 초기화. 
	private int b;
	private int c=5; //필드 c
	
	public void set(int a) { //매개변수 a, 필드 a는 매개변수 a가 되지 못함. 우선순위는 매개변수가 높음
		a=10; //매개변수 a에 10을 넣은 것. 필드 a가 10이 아님. 위에서 50을 넣었지만 여기서 a=10이 됨
		b= b+100; //매소드 안에서 선언된 지역변수가 없는 경우 필드를 가르키게 됨. 즉 필드 b에 100을 더하게 됨. 
	}
	
	public void print() {
		int c =100; //지역변수가 우선순위가 놓음. 
		System.out.println("a: "+a+", b: "+ b + ", c: "+c); //이 c는 매개변수 c. 필드 c가 아님.
		//a와 b는 필드로 찍고, c는 지역변수로 출력
	}
	
	public void write() {
		System.out.println("a: "+a+", b: "+ b + ", c: "+c); //선언된 지역변수가 없기 때문에 모두 필드값 출력
	}
}