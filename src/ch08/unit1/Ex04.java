package ch08.unit1;

public class Ex04 {
	public static void main(String[] args) {
//		Test4 t = new Test4(10); //인자가 없는 생성자가 없어서 Test4 t = new Test(); 불가
		
		Demo4 d = new Demo4();
		
		d.disp();
	}

}

class Test4 {
	int x;
	
	public Test4(int x) { //인자 있는 생성자만 존재
		this.x=x;
		
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Demo4 extends Test4 {
	int a = 10;
	
	public Demo4() {
		super(10); // 상위 클래스가 인자 있는 생성자만 있을 경우 명시적으로 인자있는 super 생성자를 만들어줘야함
	}
	
	public void disp() {
		System.out.println("x: "+x+", a: "+a);
	}
}