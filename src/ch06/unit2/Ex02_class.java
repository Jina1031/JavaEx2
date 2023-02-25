package ch06.unit2;

public class Ex02_class {//하나의 클래스에는 public class 는 하나만 가능.
	public static void main(String[] args) {
		//일반 변수(지역변수)
		int x;
//		System.out.println(x); //컴오류 초기화 하지 않으면 연산 불가
		x=50;
		System.out.println("x : "+ x);
		
		//객체--
		//1. 레퍼런스 변수 선언(객체 선언)
		// : 클래스명 변수명;
		// : 선언만 한 상태라 메모리 할당 안 되어있음
		Test2 t1;
		
		//2. 객체 생성(메모리 할당)
		// : 객체 = new 생성자(); 생성자=클래스명 
		t1=new Test2();
		
		//3. 사용
		// 필드 접근 : 객체명.필드
		// 메도드 호출 : 객체명.메소드
		t1.name="홍길동";
		t1.a=5;
		
		t1.write();//홍길동:5:10
		
	//	Test2 t2=null;//null로 초기화. null은 메모리가 할당되지 않은 상태. 아직은 쓸 수 없음
	//	t2.write(); //런타임 오류(NullPointerExceptoin)
	
		//객체 선언과 동시에 메모리 할당
		Test2 t2=new Test2();
		t2.write();//null:0:10 

		
	}
}


//클래스=데이터(필드)+기능(메소드)
class Test2{
	//필드(인스턴스 변수)
	//필드는 초기화하지 않으면 객체를 생성하는 시점에 객체는 null, 숫자변수는 0으로 초기화
	String name; //null
	int a; //0
	int b=10; //10
	
	//메소드(인스턴스 메소드)
	public void write() {
		System.out.println(name+":"+a+":"+b);
	}
}