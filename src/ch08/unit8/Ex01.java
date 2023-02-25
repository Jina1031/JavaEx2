package ch08.unit8;

import com.util.MyUtil;
//다른 패키지에 있는 클래스를 사용하기 위해 import문 작성

public class Ex01 {
	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		//System.out.println(c); //컴오류. 패키지가 다르면 protected 접근 불가
		System.out.println(util.d); //public 접근 제어자를 가진 변수만 사용 가능.
	}

}

class Test1 extends MyUtil {
	public void sub() {
		//public 과 protected 만 접근 가능
		//protected 는 하위 클래스에서 접근 가능
		System.out.println("c: "+c+ ", d: "+d);
	}
}