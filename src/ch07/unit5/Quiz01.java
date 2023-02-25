package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		  날짜를 입력 받아 요일을 출력하는 프로그램 작성
		  날짜는 문자열로 다음과 같은 형식으로 입력하면 입력형식이 잘못된 경우 재입력한다.
		  날짜=> 2023-02-15
		  출력 : 2023년 2월 15일 수요일 
		  %tA 변환문자를 사용하지 않는다.
		  정규식 ^(\\d{4}-\\d{2}-\\d{2})$
		  math 메소드 사용. 
		  Integer 로 문자열 정수로 변환
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String s, p;
		
		p="^(\\d{4}-\\d{2}-\\d{2})$";
		
		System.out.print("날짜를 입력하세요.[yyyy-dd-mm]");
		s=sc.next();
		
		if(!s.matches(p)) {
			System.out.println("입력 오류입니다. 다시 입력해주세요");
		} 
		
		String[] ss= s.split("-");
		
		int y= Integer.parseInt(ss[0]);
		int m= Integer.parseInt(ss[1]);
		int d= Integer.parseInt(ss[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		cal.getTime();
		int w = cal.get(Calendar.DAY_OF_WEEK);
		
		String a=" ";
		
		switch(w) {
		case 1 : a="일요일"; break;
		case 2 : a="월요일"; break;
		case 3 : a="화요일"; break;
		case 4 : a="수요일"; break;
		case 5 : a="목요일"; break;
		case 6 : a="금요일"; break;
		case 7 : a="토요일"; break;
		}
		
		System.out.println(y+"년 "+ m+"월 "+d+"일은 "+ a);
		
		
		
		sc.close();

	}

}
