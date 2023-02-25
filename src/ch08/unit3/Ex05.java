package ch08.unit3;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		Object obj = "korea"; //up-casting
		//String 이라서 up-casting
		System.out.println(((String)obj).length());
		
		Object n1 = 10; //up-casting
		Object n2 = 10; //up-casting
		//Object n3 = n1+n2; //up-casting
		
		int n3 = (Integer)n1 + (Integer)n2; //다운캐스팅
		System.out.println(n3); 
	
		//Object[] oo = {"서울", 90, 80,"korea"}; 
		//Arrays.sort(oo);//런타임 오류. 문자열과 숫자는 비교 불가.
		
		
		Object[] oo2 = {"서울", "90", "80", "korea"}; 
		Arrays.sort(oo2);//비교 가능.
		for(Object o : oo2) {
			System.out.print(o+ " "); //80 90 korea 서울
		}
		System.out.println();
	}

}
