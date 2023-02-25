package ch06.unit3;

public class Ex04 {

	public static void main(String[] args) {
		Test4 t=new Test4();
		int s;
		
		t.a=10;
		System.out.println(t.a);//인스턴스 변수
		System.out.println(t.b);//인스턴스 변수
		
		s=t.sub(5);//인스턴스 메소드
		System.out.println(s);
		
		s= Test4.c;//클래스 변수
		Test4.write();//클래스 메소드
		
	}
}

class Test4 {
	//변수: 필드, 지역변수, 매개변수(지역변수)
	//필드: 인스턴스 변수 + 클래스 변수
	
	// 인스턴스 변수
	// -객체 생성될 때 메모리 할당.
	// -heap 영역에 메모리 할당
	// -객체가 null이 되거나(주소를 못 찾게됨) 오랫동안 사용하지 않으면 garbage collector의 대상이됨
	// -객체에 종속되므로 객체를 통해서 접근
	int a;//0으로 초기화
	int b=10;//메모리를 할당 받을 때 10으로 초기화 
	
	// 클래스 변수
    // -클래스가 로딩될 때 메모리 할당
	// -객체 생성과 상관없이 한 번만 메모리가 할달되며 모든 객체가 공유해서 사용
	// -method(ststic)영역에 메모리 할당
	// -클래스명.변수 로 접근
	// -프로그램이 종료되는 시점에 메모리 해제
	static int c = 100;
	
	// 지역변수
	// -메소드가 호출 될 때 메모리 할당. 메소드 끝나면 메모리 사라짐
	// -스택 영역에 메모리 할당

	// 인스턴스 메소드
	// -객체 생성 후에 호출 가능. 
	// -같은 클래스내의 인스턴스 변수, 클래스 변수 모두 사용 가능.
	// -같은 클래스내의 다른 인스턴스 메소드, 클래스 메소드를 호출 가능
	public int sub(int n) { //매개변수
		int s=0; //지역변수
		
		s=n+5;
		
		return s;
	}
	
	public void disp() {
		//인스턴스 메소드는 클래스 내의 인스턴스 변수를 모두 사용 할 수 있다.
		System.out.println(a+ ":"+b);
		
		//인스턴스 메소드는 클래스 내의 인스턴스 메서드를 호출 할 수 있다.
		int x= sub(5);
		System.out.println(x);
		
		//인스턴스 메소드는 클래스 내의 클래스 변수를 사용 할 수 있다
		System.out.println(c);
		
		//인스턴스 메소드는 클래스 내의 클래스 메소드를 호출 할 수 있다
		write();//같은 클래스가 아니라면 클래스이름.메소드명
	}
	
	public static void write() {
		System.out.println("static method...");
	}
	
	//클래스 메소드는 객체 생성과 상관없이 클래스 이름으로 호출
	public static void print() {
		//클래식 메소드는 인스턴스변수나 인스턴스메소드를 직접 호출할 수 없다.
		// this 키워드 사용할 수 없다.
//		System.out.println(a); //인스턴스 변수를 직접 호출 불가
//		disp(); //인스턴스 메서드 직접 호출 불가
		
		//인스턴스변수나 인스턴스메소드는 객체를 생성 후에 사용 가능
		Test4 t= new Test4();
		System.out.println(t.b);
		t.disp();
		
		System.out.println();
		
		// 클래스 내의 클래스 변수나 클래스 메소드는 직접 사용 가능
		write();
	
	}
	
	
	
}