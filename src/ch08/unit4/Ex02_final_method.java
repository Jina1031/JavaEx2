package ch08.unit4;

public class Ex02_final_method {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		double s = d.area(10);
		d.write(s);//결과: 314.1592
	}

}

final class A {
	
}

/*
final class B extends A { //컴오류. final 클래스는 하위 클래스를 가질 수 없음.
	
}
*/

//final 메소드는 재정의 불가
class Test2 {
	public static double PI = 3.141592;
	
	public final double area(double r) {
		return r*r*PI;
	}
}


class Demo2 extends Test2 {
	/*
	public double area(double r) { //재정의 불가해서 컴오류
		return 0.0;
	}
	*/
	
	public void write(double s) {
		System.out.println("결과: "+s);
	}
}