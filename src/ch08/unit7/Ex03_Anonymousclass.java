package ch08.unit7;

public class Ex03_Anonymousclass {
	public static void main(String[] args) {
		User3 obj = new User3();
		obj.sub();

	}

}

interface Test3 {
	public void print();
}

class User3 {
	public void sub() {
		//anonymous class
		// : 익명의 클래스를 컴파일 하면 User3$1.class 형식으로 클래스 파일이 생성($ 뒤에 숫자는 순서)
		Test3 t = new Test3() { // 원래 인터페이스는 객체 생성 불가. 하지만 일회성으로 사용할 수 있음. 
			
			@Override
			public void print() {
				System.out.println("print...");
			}
		};
		
		t.print();
	}
}

