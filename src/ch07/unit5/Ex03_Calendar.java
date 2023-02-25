package ch07.unit5;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 3-1, 2);
		cal.getTime();//set으로 시간 설정 후 변경한 날짜를 getTime() 으로 호출하여 실제 시간 변경
		System.out.printf("%tF %tA%n", cal, cal); //2023-03-02 목요일
		System.out.println();
	
		//clone() : 복제, 필드의 값을 동일하게 다른 영역에 메모리 할당.
		//Object 클래스의 메소드
		//객체의 주소를 참조하는 것이 아니라 같은 내용으로 새로운 객체에 복재하는 메소드. 새로운 객체를 생성.
		//다운 케스팅이라서 다형성.
		
		Calendar sday = (Calendar)cal.clone();
		
		sday.set(Calendar.DAY_OF_WEEK, 1);
		sday.getTime();
		System.out.printf("주 시작 : %tF %tA%n", sday, sday); //주 시작 : 2023-02-26 일요일
		System.out.println();
	
		Calendar eday = (Calendar)cal.clone();
		eday.set(Calendar.DAY_OF_WEEK, 7);
		eday.getTime();
		System.out.printf("주 마지막 : %tF %tA%n", eday, eday); //주 마지막 : 2023-03-04 토요일
		System.out.println();
		
		
	}
	

}
