package ch07.unit4;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		 1~100까지 수를 한 줄에 10개씩 출력, 단 수 중에 3 6 9 가 존재하면 개수만큼 *로 출력
		 1 2 * 4 5 * 7 8 * 10
		 .
		 .
		 .
		 * * ** * * ** * ** 100
		 */
		
		String p;
		
		for(int i =1; i<=100; i++) {
			p= Integer.toString(i);
			p = p.replaceAll("[369]", "*"); //[3|6|9]
			
			if(p.indexOf("*") != -1) {
				p=p.replaceAll("\\d", "");
			}
			//13이면 1*이 아니고 *로 표시(369 게임처럼)
			
			System.out.print(p+ "\t");

			if(i%10==0) {
				System.out.println();
			}
		}
		
		
		
	}

}
