package ch08.unit7;

public class Ex02_Memberclass {
	public static void main(String[] args) {
		Test2 t = new Test2();
		Test2.User2 u = t.new User2();
		u.write();
	}

}

class Test2 {
	int a= 10;
	static int b = 20;
	
	//내부 클래스(member class)
	// : 외부에서 객체를 생성할 경우, 외부 클래스(Test2)의 객체가 생성되어야 생성 가능
	// : 즉, 외부 클래스의 객체가 메모리가 할당 되어야 사용 가능
	class User2 { //내부 클래스 시작
		int x = 200;
		
		public void write() {
			//외부 클래스의 인스턴스 변수, 인스턴스 메소드 사용 가능
			System.out.println("a: "+a+", b: "+b+", x: "+x);
			
			//sub();
		}
	}//내부 클래스 끝
	
	public void sub() {
		User2 u = new User2();
		System.out.println(u.x);
		
	}
}