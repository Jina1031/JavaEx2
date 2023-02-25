package ch08.unit1;

public class Ex05 {
	public static void main(String[] args) {
		Demo5 d = new Demo5(5);
		
		d.disp();
	}

}

class Test5 {
	int a;
	
	public Test5() {
		this.a = 0;
		System.out.println("Test5 인자 없는 생성자");
	}

	public Test5(int a) {
		this.a = a;
		System.out.println("Test5 인자 하나인 생성자");
	}

	public void print() {
		System.out.println(a);
	}
}

class Demo5 extends Test5 {
	int x;
	
	public Demo5() {
		//super();
		x = 0;
		System.out.println("Demo5 인자 없는 생성자");
	}
	
	public Demo5(int x) {
		this(x, 100); //this 쓰면 super 못 씀
		              //얘가 인자가 두 개인 생성자의 몸체를 실행
		System.out.println("Demo5 인자 하나인 생성자");
	}

	public Demo5(int x, int a) {
		super(a);
		this.x = x;
		System.out.println("Demo5 인자 하나인 생성자");
	}
	
	public void disp() {
		System.out.println("a: "+ a+ ", x: "+x);
	}
	
}