package ch06.unit4;
//초기화
public class Ex21_initialize {

	public static void main(String[] args) {
		Sample1 s1;
		//클래스가 로딩되는 시점: 처음 객체를 생성하거나 처음 클래스 변수나 클래스 메소드를 사용하는 시점
		
//		System.out.println(Sample1.y);
		// static 초기화 블럭...
		// 20
		
		s1= new Sample1();
		s1.disp();
		//static 초기화 블럭...
		//인스턴스 초기화 블럭...
		//생성자
		//a: 0, b: 1, c: 10, d: 5
		
		Sample1 s2 = new Sample1();
		s2.disp();
		//a: 0, b: 1, c: 10, d: 5
		//인스턴스 초기화 블럭...
		//생성자

	}

}

/*
 클래스가 로딩될 때 한 번만 실행
 1. 클래스 변수 메모리 할당-메소드 영역
 2. 클래스 변수를 디폴트 값으로 초기화 x:0, y:0
 3. 클래스 변수 초기화 수식을 실행-x: 10;
 4. static 초기화 블럭을 실행
 (Sample1 s2 = new Sample1(); 에서는 실행 안 함)
 
 객체를 생성할 때마다 실행
 1. new 클래스명(); : 객체를 위한 메모리 할당(인스턴스 변수 메모리 할당)- a b c d 메모리 할당
 2. 모든 인스턴스 변수를 디폴트값으로 초기화 a=0, b=0, c=0, d=0;
 3. 초기화 수식을 실행(존재하는 경우) b=1 실행
 4. 인스턴스 초기화 블럭 실행(존재하는 경우)
 5. 생성자의 몸체 실행
 
 */
class Sample1 {
	private int a;
	private int b=1;
	private int c;
	private int d;
	
	public static int x =10;
	public static int y;

	static {
		//static 초기화 블럭 : 클래스가 로딜될 때 한 번만 실행
		//static 변수 초기화할 때 사용.
		y=20;
		System.out.println("static 초기화 블럭...");
	}
	
	//d=5; //컴파일 오류, 선언부에는 실행문이 올 수 없다.
	
	{
		//인스턴스 초기화 블럭(객체가 생성될 때마다 실행)
		d=5;
		System.out.println("인스턴스 초기화 블럭...");
	}
	
	public Sample1() {
		c=10;
		System.out.println("생성자");
	}
	
	public void disp() {
		System.out.println("a: "+ a + ", b: "+ b +", c: "+ c + ", d: "+ d);
	}
}
