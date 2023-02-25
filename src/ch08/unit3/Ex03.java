package ch08.unit3;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		
		t1.print();// Test3 print...
		t2.print();// Sample3 print... //sub에서 호출하는 print는 오버라이드된 하위 클래스의 메소드가 호출
		t3.print();// Test3 print...
		
	}

}

class Test3 {
	
	public void print() {
		System.out.println("Test3 print...");
	}
	
	public void sub() {
		//write(); // 컴오류 하위 클래스의 메소드 호출 불가
		print(); // 재정의된 경우 하위 클래스의 메소드 호출 가능.
	}
}

class Sample3 extends Test3 {
	
	public void print() {
		System.out.println("Sample3 print...");
	}
	
	public void write() {
		System.out.println("write...");
	}
}

class Demo3 extends Test3{
	
	public void disp() {
		System.out.println("disp...");
	}
}