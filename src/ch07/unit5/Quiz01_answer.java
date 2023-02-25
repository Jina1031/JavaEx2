package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz01_answer {

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
		
		String s;
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		int y, m, d, w;
		
		do {
			System.out.print("날짜[yyyy-mm-dd]");
			s=sc.next();
			
		}while(! s.matches("^(\\d{4}-\\d{2}-\\d{2})$"));
		
		String[] ss= s.split("-");
		
		y= Integer.parseInt(ss[0]);
		m= Integer.parseInt(ss[1]);
		d= Integer.parseInt(ss[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		
		w=cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y+"년 "+m+"월 "+d+"일은 "+ week[w-1]+"요일입니다" );
		
		String wk = String.format("%tA", cal);
		System.out.println(y+"년 "+ m+"월 "+d+"일은 "+ wk+ " 입니다." );
		
		sc.close();

	}

}
