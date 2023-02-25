package ch08.unit7;

public class Ex01_StaticClass {
	public static void main(String[] args) {
		//User1 obj = new User(); //컴오류
		Test1.User1 obj = new Test1.User1();
		obj.write();//User1 의 메소드
	}
	
}

class Test1 {
	int a = 10;
	static int b = 0;
	
	//static 중첩 클래스 
	// : 외부(Test1) 클래스의 객체 생성 없이 외부에서 객체를 생성할 수 있는 클래스
	// : 외부의 인스턴스 변수 접근 불가
	// : 컴파일 하면 Test1$User1.class 파일이 생성됨
	// : 단독 클래스 불가
	static class User1 {                        //static 중첩 클래스 시작
		int x = 100;
		public void write() {
			//System.out.println(a); //컴오류 a는 메모리를 할당 받아야 쓸 수 있는 인스턴스 변수, a를 외부에서 사용하려면 객체 생성 필수
			System.out.println(b);   // 클래스 변수는 객체 생성 없이 메모리 할당 받기 때문에 사용 가능.  
		}
		
		public void disp() {
			Test1 t = new Test1(); // 외부 클래스 객체 생성하면 인스턴스 변수 사용 가능
			System.out.println(t.a);
			t.print();
		}
		
	}//static 중첩 클래스 끝
	
	public void print() {
		System.out.println("a: "+ a+ ", b:"+ b);// a랑 b 둘다 사용 가능
		
		User1 u = new User1(); // 내부의 static 메소드 호출
		System.out.println(u.x);
	}
	
	public static void sub() {
		System.out.println(b);
		
	}
}