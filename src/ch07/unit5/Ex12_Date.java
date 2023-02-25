package ch07.unit5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex12_Date {

	public static void main(String[] args) {
		// 날짜사이의 간격
		Date date = new Date();
		
		String s = "1997-10-31";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date2 = sdf.parse(s);
			
			//두 날짜 사이의 간격
			long diff = (date.getTime()-date2.getTime())/(1000*60*60*24); //현재 시간 - 과거 시간 (초*분*시간*날짜)
			System.out.println(diff);
		} catch (Exception e) {
			e.printStackTrace(); //에러가 발생한 경우 에러 메세지 출력
		}
	}

}
