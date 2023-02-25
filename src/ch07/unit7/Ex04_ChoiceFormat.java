package ch07.unit7;

import java.text.ChoiceFormat;

public class Ex04_ChoiceFormat {

	public static void main(String[] args) {
		// ChoiceFormat : 특정 값의 범위를 문자열로 반환
		// 문자열로만 반환
		
		double[] limt = {60, 70, 80, 90};
		String[] grade = {"D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(limt, grade);
		System.out.println("95: "+ cf.format(95));//95: A
		System.out.println("85: "+ cf.format(85));//85: B
		System.out.println("55: "+ cf.format(55));//55: D
		System.out.println();
		
		limt = new double[] {0, 60, 70, 80, 90};
		grade = new String[] {"F","D","C","B","A"};
		ChoiceFormat cf2 = new ChoiceFormat(limt, grade);
		System.out.println("95: "+ cf2.format(95));//95: A
		System.out.println("85: "+ cf2.format(85));//85: B
		System.out.println("55: "+ cf2.format(55));//55: F
		System.out.println();
		
		String p = "60#D|70#C|80<B|90#A|"; //#은 까지, <는 작다| 둘만 가능 
		ChoiceFormat cf3 = new ChoiceFormat(p);
		System.out.println("95: "+ cf3.format(95));//95: A
		System.out.println("85: "+ cf3.format(85));//85: B
		System.out.println("80: "+ cf3.format(80));//85: C
		System.out.println("55: "+ cf3.format(55));//55: D
		System.out.println();
		
		limt = new double[] {0, 60, 65, 70, 75, 80, 85, 90, 95};
		grade = new String[] {"0.0","1.0","1.5","2.0","2.5","3.0","3.5","4.0","4.5"};
		ChoiceFormat cf4 = new ChoiceFormat(limt, grade);
		System.out.println("95: "+ Double.parseDouble(cf4.format(98)));
		System.out.println("95: "+ Double.parseDouble(cf4.format(80)));
		System.out.println("95: "+ Double.parseDouble(cf4.format(55)));
		System.out.println();
	}

}
