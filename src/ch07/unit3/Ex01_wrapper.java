package ch07.unit3;

public class Ex01_wrapper {

	public static void main(String[] args) {
		int a = 10, b;
		Integer ob = null; //Integer: int에 대응되는 wrapper class
		
//		b=null; //컴오류 기본 자료형은 null을 가질 수 없음. 
		
		ob = a; //기본 자료형(int)이 Integer 형으로 자동 변환 (Auto-boxing)
//		ob = Integer.valueOf(a);
		
		b = ob; //Integer 객체가 기본 자료형(int)형으로 자동 변환 (Auto-unboxing)
//		b = ob.intValue();
		
		System.out.println("a: "+ a + ", b: "+b + ", ob: "+ ob); //a: 10, b: 10, ob: 10
		
		//MAX_VALUE, MIN_VALUE 클래스 변수 | 클래스명.변수명 으로 접근. 객체 생성 필요 없음
		System.out.println("정수(int) 최대값: "+ Integer.MAX_VALUE); //정수(int) 최대값: 2147483647
		                                                    
		System.out.println("정수(int) 최소값: "+ Integer.MIN_VALUE); //정수(int) 최소값: -2147483648
		System.out.println("int size: "+Integer.SIZE); //int size: 32
		
	}

}
