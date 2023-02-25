package ch07.unit7;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01_NumberFormat {

	public static void main(String[] args) {
		String s;
		
		//숫자 => 문자열
		int a = 12345;
		
		s = Integer.toString(a);
		System.out.println(s); //12345
		
		s = String.format("%,d", a);
		System.out.println(s); //12,345
		
		s = String.format("%.2f", 2345.5778);
		System.out.println(s); //2345.58

		s = String.format(Locale.ITALIAN, "%.2f", 2345.5778); //국가별 형식으로 출력
		System.out.println("Locale.ITALIAN=> "+ s); //2345.58
		
		System.out.println("=========NumberFormat========");
		
		//숫자에 대한 서식화 -> NumberFormat
		NumberFormat nf = NumberFormat.getInstance(); //추상 클래스이기 때문에 직접 객체 생성 불가
		s = nf.format(a);
		System.out.println(s); //12,345 자동으로 ',' 생성
		
		s = nf.format(31459.4535);
		System.out.println(s); //31,459.453
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4); //소수점 이하를 최대 4
		nf2.setMinimumFractionDigits(2); //소수점 이하를 최소 2
		System.out.println(nf2.format(123445678)); //123,445,678.00 정수+소수점+자릿수만큼 0
		System.out.println(nf2.format(1234.45678)); //1,234.4568
		
		//통화
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		System.out.println(nf3.format(12345)); //₩12,345

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf4.format(12345)); //$12,345.00
		
		//%
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		System.out.println(nf5.format(0.23));//23%
		
		
		

	}

}
