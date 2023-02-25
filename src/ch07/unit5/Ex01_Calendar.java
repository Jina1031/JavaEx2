package ch07.unit5;

import java.util.Calendar;

/*
 Calendar
 : 날짜와 시간을 객체 모델링한 클래스
 : 추상 클래스(객체 바로 생성 불가)
 */
public class Ex01_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		String s = String.format("%tF %tA %tT", cal, cal, cal); //%tF %tA %tT 날짜(yyyy-mm-dd) 요일 시간
		System.out.println(s);
		System.out.printf("%tF %tA %tT%n", cal, cal, cal);
		
		//년도만 가져오고 싶음
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1; //0(1월)~11(12월) 
		int d = cal.get(Calendar.DATE);
//		int d = cal.get(Calendar.DAY_OF_MONTH);
		int w = cal.get(Calendar.DAY_OF_WEEK); // 1(일요일)~7(토요일)
		int end = cal.getActualMaximum(Calendar.DATE); //월의 마지막 날짜
		
		System.out.println(y+"년"+m+"월"+d+"일");
		System.out.println("1: 일요일~ 7: 토요일, "+w );
		System.out.println(m+"월의 마지막 일자는 "+ end);
		
		//2023년 5월 5일로 날짜를 변경
		cal.set(2023, 5, 5);
		System.out.printf("%tF%n", cal); //2023-06-05
		
		//cal.set(2023, 5-1, 5);
		cal.set(2023, 4, 5);
		System.out.printf("%tF%n", cal); //2023-05-05
		
		//2023년 5월 35일로 날짜를 변경
		cal.set(2023, 5-1, 35);
		System.out.printf("%tF%n", cal); //2023-06-04
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 5-1);
		cal.set(Calendar.DATE, 35);
		System.out.printf("%tF%n", cal); //2023-06-04
		
		//2023년 1월 10일 남자친구 만났을 때 100일 날짜.
		cal.set(2023, 1-1, 10);
		cal.add(Calendar.DATE, 100); //지정날짜에서 100일 후
		System.out.printf("%tF%n", cal); //2023-04-20
		
		//1970년 1월 1일 0시 0분 0초를 기준으로 밀리초 단위로 환산하여 변환
		long t = cal.getTimeInMillis();
		System.out.println(t); //1681975366366초
	}

}
