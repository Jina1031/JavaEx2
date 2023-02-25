package ch07.unit7;

import java.text.MessageFormat;

public class Ex05_MessageFormat {

	public static void main(String[] args) {
		//MessageFormat : 데이터를 정해진 양식의 문자열로 반환
		//{숫자} : 데이터가 들어갈 자리
		
		String s  = "이름 : {0}\t전화:{1}\t나이:{2}";//이름 : {0} \t 전화:{1} \t 나이:{2} 
		Object[] obj = {"김자바", "010-1111-1111", 20};// {0}번째 {1}번째 
		//Object[] 은 다른 자료형도 한 번에 넣을 수 있음 
		//String[] obj = {"김자바", "010-1111-1111", "20"};//얘도 가능하지만 경고 뜸.
		
		String result = MessageFormat.format(s, obj);
		System.out.println(result); //이름 : 김자바	전화:010-1111-1111	나이:20
		
		
		
	}

}
