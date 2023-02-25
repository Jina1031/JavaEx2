package ch07.unit4;

public class Ex02_String {

	public static void main(String[] args) {
		//문자열 비교
		String s1 = "seoul";
		String s2 = new String("seoul");
		
		//객체의 ==는 주소를 비교
		System.out.println(s1 == "seoul"); //true
		System.out.println(s2 == "seoul"); //false
		System.out.println(s1==s2); //false
		
		//주소가 아닌 문자열을 비교
		//String .equals()
		// : String equals() 메소드는 Object equals() 메소드를 override
		// : String equals() 메소드는 문자열을 비교
		// : Object equals() 메소드는 주소 비교
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("seoul")); //true
		
		s1 = "seoul";
		s2 = "SEOUL";
		System.out.println(s1.equals(s2)); //false 대소문자 비교. 
		System.out.println(s1.equalsIgnoreCase(s2)); //true 대소문자 무시. 
		System.out.println();
		
		s1="seoul korea";
		s2="seoul";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.startsWith(s2));//true //앞부분만 비교

		s1="seoul korea";
		s2="korea";
		System.out.println(s1.endsWith(s2));//true //뒷부분만 비교
		
		//문자열의 비교에서 > < = 등은 사용 불가
		s1="seoul korea";
		s2="seoul good";
		System.out.println(s1.compareTo(s2)); //4 //틀린 첫번째 문자의 ASCII코드 차이 : g - h i j - k 
		
	}

}
