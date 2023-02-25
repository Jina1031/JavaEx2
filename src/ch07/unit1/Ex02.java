package ch07.unit1;

//java.util 패키지이 모든 클래스를 import
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		Calendar cal = Calendar.getInstance();
		System.out.printf("오늘 날짜: %tF%n", cal);
		
		System.out.println("이름? ");
		s=sc.next();
		System.out.println(s);
		
		sc.close();
	}

}
