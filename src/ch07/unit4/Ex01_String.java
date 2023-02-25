package ch07.unit4;

public class Ex01_String {

	public static void main(String[] args) {
		//문자열은 상수풀에 저장
		//상수풀에 동일한 문자열이 존재하면 해당 문자열의 주소를 반환
	
		String s1= "seoul"; //"seoul"이 먼저 상수풀에서 메모리 할당을 받고 그 주소를 s1에 대입
		String s2= "seoul"; //"seoul"이 상수풀에 존재하기 때문에 존재하는 문자열의 주소를 반환 이 "seoul"은 메모리 할달 x
		//s1 과 s2는 같은 주소를 공유 동일한 영역을 참조
		
		//새로운 객체를 생성하여 문자열을 설정
		String s3=new String("seoul"); // new 로 새로운 메모리 할당하여 s3는 다른 주소를 참조 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//주소 비교
		System.out.println(s1==s2); //true 같은 주소, 동일한 객체
		System.out.println(s1==s3); //false 다른 주소, 다른 객체
		
		System.out.println("s1 hashcode: "+s1.hashCode()); //s1 hashcode: 109324212
		System.out.println("s2 hashcode: "+s2.hashCode()); //s2 hashcode: 109324212
		System.out.println("s3 hashcode: "+s3.hashCode()); //s3 hashcode: 109324212
		
		//String, Integer, Long 클래스 등의 내용은 불변.
		//값이 바뀌면 새로운 영역에 메모리를 할당
		s1 += "korea"; //String 클래스는 내용 불변이라 seoulkorea 라고 따로 새로운 메모리를 확보
		System.out.println(s1);//seoulkorea
		System.out.println(s2);//seoul
		System.out.println(s1==s2); //false //s1의 주소 변경
		System.out.println("s1: "+s1+ ", s2: "+s2);
		
		String s4= ""; //문자열의 길이가  0인 문자열
		System.out.println(s4.length());// 0 출력
		//문자열.length = 문자열의 길이
//		String s5 = null; //메모리가 할당되지 않은 상태
//		System.out.println(s5.length()); //런타임 오류 (NullPointerException)
		
		
		
		
	}

}
