package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 생년월일을 입력받아 만 나이를 구하는 프로그램 작성
		 날짜는 문자열로 다음과 같은 형식으로 입력하면 입력 형식이 잘못된 경우 재입력 한다.
		 생년월일? 2023- 02-15
		 출력 나이=> 0살
		 정규식 ^(\\d{4}-\\d{2}-\\d{2})$
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String s, p;
		
		p="^(\\d{4}-\\d{2}-\\d{2})$";
		
		System.out.print("생일을 입력하세요.[yyyy-dd-mm]");
		s=sc.next();
		
		if(!s.matches(p)) {
			System.out.println("입력 오류입니다. 다시 입력해주세요");
		}
		
		String[] ss= s.split("-");
		
		int y= Integer.parseInt(ss[0]);
		int m= Integer.parseInt(ss[1]);
		int d= Integer.parseInt(ss[2]);
		
		Calendar cal = Calendar.getInstance();
		int nowyear=cal.get(Calendar.YEAR);
		
		int age= nowyear-y;
		
		if(cal.get(Calendar.MONTH)<m && cal.get(Calendar.DATE)<d) {
			age--;
		}
		
		System.out.println("만 나이는 "+age+"살입니다.");
		
		sc.close();
	}

}
