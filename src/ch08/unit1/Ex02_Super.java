package ch08.unit1;

public class Ex02_Super {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.disp();
		System.out.println("obj.b: "+obj.b);
		System.out.println("obj.a: "+obj.a);
	}

}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void prin() {
		System.out.println("a: "+a+", b: "+b);
		//System.out.println("a: "+this.a+", b: "+this.b);
		
	}
}

class Demo2 extends Test2{
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x =50;
		
		System.out.println("this.a: "+this.a ); //super.a = this.a = a 결과 다 동일
		System.out.println("super.a: "+this.a ); //super.a = this.a = a 결과 다 동일
		System.out.println("this.b : "+this.b ); 
		System.out.println("super.b: "+super.b );

		System.out.println("x: "+x ); //지역변수 
		System.out.println("this.x: "+this.x ); //필드
	}
}

