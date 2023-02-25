package ch06.unit3;

public class Ex02 {

	public static void main(String[] args) {
		Test2 tt= new Test2();//객체 생성
		int s;
		
		s= tt.sum(10); //10:실인수 실매개변수 /호출하는 곳에서 넘겨주는 변수. (int n) 
		               //실인수 혹은 실매개변수는 메소드의 매개변수보다 타입이 작아야 함
		
		System.out.println(s);
		System.out.println(tt.sum(100));
		
		System.out.println(tt.isEven(10));//true
		
		System.out.println(tt.upper('a'));//'A'
		System.out.println(tt.upper('*'));
		
//		s = tt.max(5); //컴오류 매개 변수가 2개이기 때문에 2개의 실인수를 넣어야 함
		s = tt.max(5, 7);
		System.out.println(s);
		
		tt.gugudan(3); //void 메소드는 반환값이 없음
		
	}
}

class Test2{
	//1~n까지 합 구하는 메소드
	//인스턴스 메소드이며 객체를 생성해야만 그 객체를 통해서 호출 가능
	//*접근제어*/ int/*반환타입*/ sum(int n)/*메소드 이름(매개변수)*/
	public int sum(int n) {//n: 매개변수-메소드가 호출될 때 스택 영역에 메모리 확보
		int s=0;//지역변수-메소드가 호출될 때 스택 영역에 메모리 확보
		        //지역변수(매개변수)는 메소드가 종료되는 시점에 메모리 회수
		
		for(int i =0;i<=n;i++) {
			s+=i;
		}
		
		return s;//리턴문. 메소드를 호출한 곳으로 돌려주는 값. return문 아래에는 실행문이 올 수 없다.
	}
	
	
	//n이 짝수인면 true를 반환하는 메소드
	public boolean isEven(int n) {
		//return n%2 == 0;
		return (n&1) == 0; //비트단위 연산. 비트단위 연산은 정수만 가능. 실수는 안됨.
	}
	
	
	//인수로 넘어온 문자가 소문자이면 대문자로 변환하는 함수
	//int->char
	
	public char upper(char c) {
		
		return c >= 'a' && c <= 'z' ? (char)(c-32) : c;  
				
	}
	
	//인수로 넘어온 문자가 대문자 인자 판별

	public boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}
	
	
	//두 수 중 큰 수를 구하는 함수
	
//	public int max(int a, b) 컴파일 오류
	public int max(int a, int b) {
		return a > b? a : b;
	}
	
	
	//n단의 구구단을 출력하는 메소드. 단, 인수로 넘어온 dan이 1보다 적거나 9보다 크면 출력하지 않는다
	//메소드는 실행된 결과를 돌려줄 때 한개만 돌려줄 수 있음.
	//즉 구구단은 반환값이 없이 메소드는 구구단을 출력하는 행위만 진행
	//반환값이 없는 메소드는 void. return 생략 가능
	public void gugudan(int dan) {
		 if(dan < 1 || dan > 9) {
			 return; //메서드를 호출한 곳으로 리턴
		 }
		for(int i=1; i<=9;i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	
	//점수에 따른 평점을 계산하는 메소드
	//95~100 : 4.5, 90~94 : 4.0, ...
	
	public double grade(int n) {
		double grade; //else -> if문을 실행하지 않을 때 라는 뜻이기 때문에(어떤 경우에도 grade는 무조건 값을 가지게 됨) 초기화 필요 없음 
		
		
		if(n>=95) {
			grade=4.5;
		}else if(n>=90) {
			grade=4.0;
		}else if(n>=85) {
			grade=3.5;
		}else if(n>=80) {
			grade=3.0;
		}else if(n>=75) {
			grade=2.5;
		}else if(n>=70) {
			grade=2.0;
		}else if(n>=65) {
			grade=1.5;
		}else if(n>=60){
			grade=1.0;
		}else {
			grade=0;
		}
		
		return grade;
		
	}
	
	//점수에 따른 학점 구하기
	//90~100 : A, 80~89:B... 0~59:F
	
	public char rank(int score) {
		char c;
		
		if(score>=90) c='A';
		else if(score>=80) c='B';
		else if(score>=70) c='C';
		else if(score>=60) c='D';
		else c='F';
		
		return c;
	
	}
	
	public String hakjeom(int score) {
		String s;
		
		switch(score/10) {
		case 10:
		case 9: s="A"; break;
		case 8: s="B"; break; 
		case 7: s="C"; break;
		case 6: s="D"; break;
		default: s="F"; break;
		}
		
		return s;
	}
	
	
}