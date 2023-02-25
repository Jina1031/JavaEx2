package ch07.unit5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11_Date {

	public static void main(String[] args) {
		Date date = new Date(); //현재 시스템으로 Date 객체 생성
		System.out.println(date.toString()); //미국식으로 날짜 출력 Thu Feb 16 09:28:39 KST 2023
		
		//1970년 1월 1일 0시 0분 0초를 기준으로 밀리초단위로 환산
		long t = date.getTime();
		System.out.println(t); //1676507406429
		
		Date date2 = new Date(1676507406429L); //1676507406429 애를 기준으로 객체 생성
		System.out.println(date2);
		
		System.out.println(date.after(date2)); //true 
		//date 객체가 date2 이후의 날짜이면 true
		//date2는 아까 찍은 날짜이고 date는 현재 날짜로 찍음
		
		//SimpleDateFormat : 문자열이 있으면 문자열을 날짜로 바꾸거나, 날짜를 문자열로 바꿀 수 있음
		
		//Date 객체를 String 서식으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss"); //서식 HH는 24시 표시
		String s = sdf.format(date);
		System.out.println(s);
		
		//문자열을 Date 객체로 변환
		String str = "2023-02-16";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd"); //위에 String 과 서식맞춰서 써야함 안 그러면 터짐
		
		//예외처리 
		try {
			// 예외를 내포하고 있는 코드
			Date date3 = sdf2.parse(str);
			System.out.println(date3);
		} catch (ParseException e1) {
			// 예외가 발생할 때 실행할 코드
			e1.printStackTrace();
		}
		
		
	}

}
