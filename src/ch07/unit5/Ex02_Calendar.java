package ch07.unit5;

import java.util.Calendar;

public class Ex02_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2023, 2-1, 1);
		System.out.printf("%tF%n", cal);//2023-02-01
		
		cal.set(Calendar.DAY_OF_WEEK, 1);//일요일로 변경
		System.out.printf("%tF%n", cal); //2023-02-12
		//초기 시스템 날짜가 있는 주의 일요일 날짜가 출력.
		
		//set() 메소드는 Calendar필드의 값은 변경되지만
		//Calendar의 시간값은 변경되지 않는다. 
		//Calendar의 시간값은 get(), getTime(), getTimeMillis(), add() 메소드 중 하나의 메소드 호출해서 변경
		//set()은 여러번 호출해도 여러번 불필요한 연산을 트리거하지 않는다.
		
		System.out.println("----------------------------");
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 2-1, 1);
		System.out.printf("%tF%n", cal2);//2023-02-01
		
		cal2.getTime(); //진짜 시간을 바꿔주는 메소드
		
		cal2.set(Calendar.DAY_OF_WEEK, 1);//일요일로 변경
		System.out.printf("%tF%n", cal2); //2023-01-29/ 02-01 있는 주의 일요일.
		
	}

}
