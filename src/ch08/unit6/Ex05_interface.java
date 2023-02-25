package ch08.unit6;

public class Ex05_interface {
	public static void main(String[] args) {
		Cdemo5 obj = new DemoImpl5();
		obj.disp();
		obj.sub();
		obj.print();
		
	}
}

interface Ademo5 {
	public void print();
}

interface Bdemo5 {
	public void disp();
}

//인턴페이스는 다른 인터페이스를 상속받을 수 있다.
//인터페이스는 다른 인터페이스를 다중 상속으로 받을 수 있다. 다중 상속 지원.
//Cdemo5는 print disp sub 다 가지고 있음
interface Cdemo5 extends Ademo5, Bdemo5 {
	public void sub();
}

//Cdemo5가 구현하지 않은 인터페이스 메소드를 구현할 클래스
class DemoImpl5 implements Cdemo5{

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void disp() {
		System.out.println("disp...");
	}

	@Override
	public void sub() {
		System.out.println("sub...");
	}
	
}