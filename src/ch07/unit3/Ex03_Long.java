package ch07.unit3;

public class Ex03_Long {

	public static void main(String[] args) {
		long a;
		Long b;
		
		a = 10; //long 변수에 int 리터널 10을 대입
//		b = 10; //컴파일 오류. Long 클래스 객체에는 int 리터널 대입 불가 
		b = 20L;
		//클래스는 자료형이 다르면 넣을 수 없음.
		
		System.out.println("a: "+ a+ ", b: "+b);
		
		b = b+a; //가능
		System.out.println(b); //30
		
//		int x = a;  //int 에 long 넣을 수 없음 대입 불가.
		int x = (int)a; //기본 자료형 형변환
//		int y = (int)b; //컴오류 
//		Integer y = (Integer)b; //컴오류 클래스는 상하관계가 아닌 경우 형변환 불가
		System.out.println(x);//10
		
		//클래스의 상하관계
		// Integer는 Number 클래스의 자손이기 때문에 
		
		
		
	}

}
