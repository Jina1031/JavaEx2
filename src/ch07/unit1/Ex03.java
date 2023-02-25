package ch07.unit1;

//정적인 멤버를 클래스명을 명시하지 않고 접근
import static java.lang.Math.*;

public class Ex03 {

	public static void main(String[] args) {
		double a;
		a=Math.random();
		System.out.println(a);
		
		System.out.println("원주율 : "+ PI);
		//import 안 쓰면 Math.PI 로 접근했어야 함
	}

}
