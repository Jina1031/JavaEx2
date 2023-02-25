package ch07.unit4;

import java.io.StringBufferInputStream;

public class Ex03_String {

	public static void main(String[] args) {
		// String 클래스 주요 메소드
		
		String s1 = "seoul korea";
		String s2;
		int n;
		
		//length
		n=s1.length();
		System.out.println(s1 + ":" + n); //11
		
		
		//subString
		//6번째 인덱스부터 8번째 인덱스까지 문자열 추출
		s2= s1.substring(6, 9);
		//substring(s, e)->s 인덱스부터 e-1까지 추출. 마지막 e는 포함하지 않음
		System.out.println(s2); //kor
		
		
		//6번째 인덱스부터 마지막까지 문자열 추출
		s2= s1.substring(6);
		System.out.println(s2);//korea
		
		s1.toUpperCase(); //대문자로 변경 안됨. String은 내용 불변
		s2=s1.toUpperCase(); //바꾼 내용을 다른 변수에 저장
		System.out.println(s2);
		
		//index 부분 추출
		char c = s1.charAt(6);
		System.out.println(c);
	}

}
