package ch06.unit4;

public class Ex23_singleton {

	public static void main(String[] args) {
//		Sample3 ss = new Sample3(); //생성자의 접근제어자가 private이기 때문에 컴파일 오류
		                            //외부에서 객체 생성이 불가능
		
		Sample3 s1= Sample3.getInstance();
		Sample3 s2= Sample3.getInstance();
		
		System.out.println(s1==s2); //true 
		                            //s2는 객체를 생성하지 않음. 동일한 객체를 공유
		
		System.out.println(s1.add());// 11
		System.out.println(s2.add());// 12
	}

}

//singleton 패턴 : 객체가 하나만 생성되는 디자인 패턴의 일종
//이 프로그램은 동시성의 문제를 발생시킬 수 있음
class Sample3 {
	private static Sample3 obj; //obj는 null로 초기화
	private int a = 10;
	
	private Sample3() {//생성자가 private
	}

	public static Sample3 getInstance() {
		if(obj == null) {  //s2에서는 obj가 null이 아님. 객체 생성 하지 않음.
			obj = new Sample3(); //obj에 새로운 객체를 생성
		}
		return obj;
	}
	
	public int add() {
		return ++a;
	}
	
	public int sub() {
		return --a;
	}
}