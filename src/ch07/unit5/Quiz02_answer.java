package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz02_answer {

	public static void main(String[] args) {
		/*
		 생년월일을 입력받아 만 나이를 구하는 프로그램 작성
		 날짜는 문자열로 다음과 같은 형식으로 입력하면 입력 형식이 잘못된 경우 재입력 한다.
		 생년월일? 2023- 02-15
		 출력 나이=> 0살
		 정규식 ^(\\d{4}-\\d{2}-\\d{2})$
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String birth;
		int age;
		
		
		do {
			System.out.print("생일을 입력하세요.[yyyy-dd-mm]");
			birth=sc.next();
			birth=birth.replaceAll("(\\-|\\/|\\.)", ""); //-나 / 나 . 있으면 없앰
		}while(!birth.matches("^(\\d{8})$")); //8가지 숫자로 제한
		
	
		int y= Integer.parseInt(birth.substring(0, 4));
		int m= Integer.parseInt(birth.substring(4, 6));
		int d= Integer.parseInt(birth.substring(6));
		
		Calendar now = Calendar.getInstance();
		
		age= now.get(Calendar.YEAR)-y;
		
		
		
		if(m > now.get(Calendar.MONTH)+1 || (m == now.get(Calendar.MONTH)+1 && d > now.get(Calendar.DATE))) {
			age--;
		}
		
		System.out.println("만 나이는 "+age+"살입니다.");
		
		sc.close();
	}

}
