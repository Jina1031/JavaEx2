package ch07.unit3;

public class Ex02_Integer {

	public static void main(String[] args) {
		String s1, s2;
		int a, b;
		
		s1 = "123";
		s2 = "456";
		System.out.println("s1+s2: "+ s1+s2); //문자열 결합
		
		//문자열을 정수(10진수)로 변환
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		System.out.println("a+b :" + a+b);
		
//		a=Integer.parseInt("1,234"); //런타임 오류(NumberFormatException)
//		a=Integer.parseInt("123.4"); //런타임 오류(NumberFormatException)
		                             // , 나 . 이 있으면 int로 바꾸지 못함
//		a=Integer.parseInt("b1");    // 문자열도 안됨 
		
		
		//16진수형태의 문자열을 10진수의 정수로 변환
		a=Integer.parseInt("b1",16); //16진수 b1을 10진수로
		System.out.println(a); //177
		
		a=Integer.parseInt("1100");
		System.out.println(a); //10진수 1100
		
		a=Integer.parseInt("1100", 2);//2진수 1100을 10진수로
		System.out.println(a); //12
		
		a=123;
		//int를 String으로 변환
		s1= Integer.toString(a);
		System.out.println(s1);//"123"
	
		//int를 2진수 형식의 String으로 변환
		s1= Integer.toBinaryString(a);
		System.out.println(s1);//"1111011"
		
		//int를 16진수 형식의 String으로 변환
		s1= Integer.toHexString(a);
		System.out.println(s1);//"7b"
	
	
	
	}

}
