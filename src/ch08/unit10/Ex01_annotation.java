package ch08.unit10;

import java.util.Date;

public class Ex01_annotation {
	public static void main(String[] args) {
		User1 u = new User1();
		u.sub1();
		u.sub2();
	}

}

class User1 {
	
	//@Override
	// : 오버라이드 잘 되었는지 자바 문법적으로 검증하는 어노테이션
	@Override
	public String toString() {
		return "annotation test";
	}
	
	//@Deprecated
	// : 더 나은, 개선된 메소드가 있음을 나타내는 어노테이션
	@Deprecated //사용을 자제했으면 하는 메소드
	public void sub1() {
		System.out.println("사용을 자제하세요");
	}

	//Deprecated 메세지 안 뜨게 하는 법
	//@SuppressWarnings
	// : 컴파일러의 경고와 관련된 어노테이션
	// : 이 부분에 대해서는 경고문을 출력하지 말라는 의미
	@SuppressWarnings("deprecation")
	public void sub2() {
		Date date = new Date();
		int y = date.getYear() + 1900; 
		System.out.println();
	}
	
}