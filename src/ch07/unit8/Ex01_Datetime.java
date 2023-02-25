package ch07.unit8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01_Datetime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("현재 날짜: "+date); //현재 날짜: 2023-02-16

		LocalDate date2 = LocalDate.of(2023, 03, 01);
		System.out.println("현재 날짜: "+date2); //현재 날짜: 2023-03-01
		
		LocalTime time = LocalTime.now();
		System.out.println(time);//시 분 초 밀리세컨즈 14:37:35.934689300
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime); //2023-02-16T14:38:21.651662100 중간에 T 로 구분
		
		
		
	}

}
