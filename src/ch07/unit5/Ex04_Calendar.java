package ch07.unit5;

import java.util.Calendar;
import java.util.Scanner;

public class Ex04_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m ,w;
		
		do {
			System.err.print("년도를 입력하세요");
			y=sc.nextInt();
		}while(y<1900);
		
		do {
			System.out.println("월을 입력하세요.");
			m=sc.nextInt();
		}while(m < 1 || m >12);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, 1);
		w= cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("\n\t"+y+"년"+m+"월");
		System.out.println("---------------------------------------------");
		System.out.println("   일   월   화   수   목   금   토");
		System.out.println("---------------------------------------------");
		
		
		for(int i=1; i<w;i++) {
			System.out.print("    ");
		}
		
		for(int i =1; i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%4d",i);
			if(++w % 7 ==1) {
				System.out.println();
			}
		}
		if(w%7!=1) {
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		
		sc.close();
	}

}
