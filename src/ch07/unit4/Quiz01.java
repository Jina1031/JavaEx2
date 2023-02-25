package ch07.unit4;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 정수를 입력 받아 몇자리 정수인지 출력
		
		Scanner sc = new Scanner(System.in);
/*		
		String n;
		int count;
		
		System.out.print("정수를 입력하세요.");
		n=sc.next();
		
		count=0;
		
		do {
			count++;
		}while(count<n.length());
		
		System.out.println("입력 받은 정수는 " +count+"자리 수 입니다.");
*/		
		
		String s;
		int n;
		
		System.out.print("정수? ");
		n=sc.nextInt();
		
//		s=n+"";
		s= n>0? Integer.toString(n):Integer.toString(n*-1); // 음수면 양수로 전환
		
		System.out.println(n+ ":"+s.length()+"자리수 정수");
	
		sc.close();
	}

}
