package ch07.unit4;

import java.util.Scanner;

public class Ex04_String {

	public static void main(String[] args) {
		/*
		 이름을 입력 받아 김씨의 인원 수 출력
		 입력받은 값이 end, End END 등이면 인원수를 출력하고 종료
		 예:
		 이름[종료: end]? 김자바
		 이름? 최자바
		 이름? 박자바
		 end
		 */
		Scanner sc=new Scanner(System.in);
		
		int count;
		String name;
		
		count=0;
		
		while(true) {
			System.out.println("이름을 입력하세요.[종료: End]");
			name=sc.next();
			if(name.startsWith("김")) {
				count++;
			}
			/*
			 if(name.charAt(0)=='김') { //문자 열을 비교
				count++;
			}
			 */
			if(name.equalsIgnoreCase("end")) {
				break;
			}
		}			

		System.out.println("김씨 성을 가진 사람의 수: " + count);
		
		sc.close();

	}
}
