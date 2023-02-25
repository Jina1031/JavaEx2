package ch07.unit5;

import java.util.Calendar;
import java.util.Date;

public class Ex13_Date {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n", cal); //오늘 날짜 출력 2023-02-16
		
		//Calendar 객체를 Date 객체로 변환
		//Calendar => java.util.Date
		
		Date date = cal.getTime();
		System.out.println(date); //Thu Feb 16 10:29:06 KST 2023
		
		/*
		 -java.base: 기본 모듈
		 -java.se : java.destop(java.awt, javax.swing), java.sql(java.spl, javax.spl) 모듈이 포함 
		 //module-info 에 java.se 추가
		 */
		
		//java.util.Date => java.sql.Date 로 변환
		//java.sql.Date => 클래스 이름이 똑같고 패키지가 달르면 임포트 불가
		// : DB에 날짜를 저장하거나 DB의 날짜를 추출할 때 사용
		// : yyyy-MM-dd 형식으로 출력
		
		java.sql.Date date2 = new java.sql.Date(date.getTime());//패키지명 다 써야함 임포트 안되서
		System.out.println(date2); //2023-02-16
		
		//java.util.Date=>Calendar
		
		cal.setTime(date2);
		System.out.printf("%tF\n", cal);
		
	}

}
