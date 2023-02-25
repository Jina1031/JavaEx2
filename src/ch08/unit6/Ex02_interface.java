package ch08.unit6;

public class Ex02_interface {
	public static void main(String[] args) {
		TestImpl2 t = new TestImpl2();
		t.disp();
		t.print();
		t.sub();
		
		Atest2 t2 = new TestImpl2(); //up-casting
		Btest2 t3 = new TestImpl2(); //up-casting
		
		t2.disp();
		//t3.disp(); //컴오류 Btest2에는 disp 없음
		((Atest2)t3).disp(); //TestImpl2가 Atest2 Btest2 구현해서 가능
		
		((TestImpl2)t2).sub(); //down-casting 가능
	}
}

interface Atest2 {
	public void disp();
}

interface Btest2 {
	public void print();
}

//클래스는 2개 이상의 인터페이스를 구현할 수 있다.
//다중 상속은 안되지만 다중 구현은 가능
class TestImpl2 implements Atest2, Btest2{

	@Override
	public void print() {
		System.out.println("Btest2-print...");
	}

	@Override
	public void disp() {
		System.out.println("Atest2-print...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}