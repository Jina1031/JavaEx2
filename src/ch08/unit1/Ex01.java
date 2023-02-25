package ch08.unit1;

public class Ex01 {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		System.out.println("obj.b: "+obj.b);
		obj.print(); //상위 클래스 메소드 호출
		
		obj.disp();
	}

}

class Test1 {//상위 클래스 Object
	private int a = 10; //private는 하위 클래스도 접근 불가
	int b=20; //동일한 패키지에서 접근 가능
	protected int c = 30; //동일한 패키지 + 하위 클래스 접근 가능
	public int d = 40;
	
	public void print() {
		System.out.println("a: "+ a+ ", b: "+b+", c :"+c+", d :"+d);
	}
}

class Demo1 extends Test1 {//자바는 단일 상속만 가능
	int x = 100;
	
	public void disp() {
		System.out.println("물려 받은 필드 => b: "+ b + ", c :" + c + ", d :"+ d);
		System.out.println("x: "+ x);
//		System.out.println(a);//컴오류 
	
	}
	
	public void sub() {
		print();//상위 클래스 메소드
	}
}