package ch07.unit4;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 수식을 입력 받아 연산하는 프로그램 작성
		 예 
		 수식 ? 10 + 5
		 10 + 5 = 15
		 수식을 입력할 때 부호는 모두 양수만 입력한다는 가정하에 문제를 해경
		 수식에서 연산자는 + - / * 만 가능
		 기타수식은 연산자 입력 오류 출력
		 
		 1. 입력받은 것 중에 replaceAll 통해서 숫자 지워서 연산자 알아내기
		 2. 해당연산자 indexOf 통해서 위치 알아내서
		 3. 잘라내기
		 
		 이 외에도 배열 이용해서 문제 해결방법이 있는데 설명은 배열 이용 하는 것으로.
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		String n, p;
		
		System.out.print("수식을 입력해주세요[연산자: + - * / ]");
		n=sc.next();
		
		p=n.replaceAll("[0-9]", "");
		*/
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("수식을 입력해주세요[연산자: + - * / ]");
		str=sc.nextLine(); //중간에 공백 사용 가능
		str = str.replaceAll("\\s", ""); // \\s=공백
		
		//[\\+|\\-|\\/|\\*]=[+-/*]라는 의미지만 '+'인지 정규식 패턴인지 구분이 안가서 \\ 써주는 것
		if(!str.matches("^\\d+[\\+|\\-|\\/|\\*]\\d+$")) { //^ 처음부터 $ 끝까지 + 한 자 이상(하나이상)
			System.out.print("수식 입력 오류입니다");
			sc.close();
			//return;
			System.exit(0);//프로그램 강제 종료
		}

/*spilt 쓰는 방법

		String[] ss= str.split("[\\+|\\-|\\/|\\*]"); 
		//속에 들어있는 정규식을 기반으로 문자열로 분류하여 배열에 넣음
        //System.out.println(ss[0]);
        //System.out.println(ss[1]);
		// 59 + 80 이면 59가 ss[0], 80이 ss[1]
		 
		char op= str.charAt(ss[0].length()); //ss[0]의 길이를 파악하여 그 길이 index의 문자를 추출
        //System.out.println(op); // 연산자 분리
		
		//숫자와 연산을 분리
		int n1=Integer.parseInt(ss[0]);
		int n2=Integer.parseInt(ss[1]);
		
		int result =0;
		
		switch(op) {
		case '+' : result = n1 + n2; break;
		case '-' : result = n1 - n2; break;
		case '*' : result = n1 * n2; break;
		case '/' : result = n1 / n2; break;
		}
		System.out.printf("%s = %d%n", str, result);
*/		
		
/* replacs 쓰는 방법
 	
		String op = str.replaceAll("\\d", ""); //연산자 분리의 또 다른 방법
		int n1=Integer.parseInt(str.substring(0, str.indexOf(op))); //0부터 op index까지 출력(마지막 포함x)
		int n2=Integer.parseInt(str.substring(str.indexOf(op)+1)); //op index +1 부터 끝까지
		
		int result =0;
		
		switch(op) {
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;
		}
		System.out.printf("%s = %d%n", str, result);
*/	
		

/*
		for(String op : new String[] {"+","-","*","/",}) {
			int pos = str.indexOf(op); //op가 나타나는 index pos에 대입
			if(pos>0) {
				int n1=Integer.parseInt(str.substring(0, pos)); //0부터 pos까지 출력 (마지막 포함x)
				int n2=Integer.parseInt(str.substring(pos+1)); //pos +1 부터 마지막까지
				
				int result =0;
				
				switch(op) {
				case "+" : result = n1 + n2; break;
				case "-" : result = n1 - n2; break;
				case "*" : result = n1 * n2; break;
				case "/" : result = n1 / n2; break;
				}
				System.out.printf("%s = %d%n", str, result);
				break;
			}
		}
*/		
		sc.close();

	}

}
