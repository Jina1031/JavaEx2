package ch07.unit4;

import java.util.Scanner;

public class Ex08_String {

	public static void main(String[] args) {
		// 문자열을 입력 받아 입력 받은 문자열이 abc로 시작하는 문자열 수 출력
		// 단, 입력 받은 문자열이 end이면 종료하며 입력 받은 문자열은 대소문자를 구분하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		String n;
		int count;
		
		count=0;
		
		while(true) {
			System.out.print("문자열을 입력하시요[end=종료]");
			n=sc.next();
			
			if(n.equalsIgnoreCase("end")){
				break;
			}
/*
			if(n.substring(0, 3).equalsIgnoreCase("abc")) { //런타임 오류가 발생할 수 있음 입력은 a만 하는 경우
				count++;
			}
*/
			
			if(n.toLowerCase().startsWith("abc")) { //모두 소문자로 변경한 뒤에 매치
				count++;
			}

			if(n.toLowerCase().indexOf("abc")==0) { //indexOf로 비교
				count++;
			}
		}
		
		System.out.println("개수: "+ count);
		sc.close();
		
	}

}
