package ch06.unit4;

public class Ex03 {

	public static void main(String[] args) {
		Test03 ob = new Test03(); //인자가 없는 생성자 호출
		ob.disp(); //10, 10

		Test03 ob2 = new Test03(100); //인자가 있는 생성자 호출
		ob2.disp();//100. 0

		Test03 ob3 = new Test03(100,200); // 인자가 두 개인 생성자 호출
		ob3.disp();// 100 200
	}

}

class Test03 {
	private int a;
	private int b;
	
	//생성자는 중복 정의가 가능하다
	
	public Test03() {
		a=10;
		b=10;
		System.out.println("인자가 없는 생성자...");
		
	}
	
	public Test03(int x) {
		a=x;
		System.out.println("인자가 있는 생성자...");
	}

	public Test03(int x, int y) {
		a=x;
		b=y;
		System.out.println("인자가 두개인 생성자...");
	}
	
	public void disp() {
		System.out.println("a : "+ a + ", b : "+ b);
	}
}