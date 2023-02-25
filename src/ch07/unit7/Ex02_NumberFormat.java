package ch07.unit7;

import java.text.NumberFormat;

public class Ex02_NumberFormat {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		
		//문자열 => 숫자
		int a = Integer.parseInt(s1);
		System.out.println(a);
		
		//a = Integer.parseInt(s2); //NumberFormatException 런타임 오류. , 때문에 숫자로 변환 물가
		a = Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(a);
		System.out.println();
		
		
		//Number : Integer, Long, Double 등의 상위 클래스
		//int long double 등 기본 숫자 자료형은 서로 형변환이 가능
		//Integer Long Double 등은 서로 상하관계가 아니므로 형변환이 되지 않는다
		//Long 에 int 리터럴 못 넣음
		try {
			NumberFormat nf = NumberFormat.getInstance();
			//예외를 내포하고 있는 코드: 프로그램 실행 중 예외가 발생하면 catch 블럭 시행
			Number n1 = nf.parse(s1); //Long
			Number n2 = nf.parse(s2); //Long
			Number n3 = nf.parse(s3); //Double
			//반환 자료형 다 Number

			System.out.println(n1); //1000
			System.out.println(n2); //1234
			System.out.println(n3); //4567.12
			//다 숫자로 출력된 것처럼 보이지만 숫자가 아님. 연산도 불가.
			
			//Integer ob =  (Integer)n1; //형변환 런타임 오류. 
			System.out.println("Long 형변환");
			Long ob =  (Long)n1; 
			System.out.println(ob);
			System.out.println(ob+10); //1010 실제는 ob.longValue()+10
			//실수는 Double형, 정수는 Long형으로 변환
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
