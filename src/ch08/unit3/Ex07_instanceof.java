package ch08.unit3;

public class Ex07_instanceof {
	public static void main(String[] args) {
		Object o = new Test7();
		
		if( o instanceof Test7) {
			Test7 t = (Test7)o;
			t.print();
		}
		
		//instanceof 연산자의 패턴 매칭
		// : JDK 14 preview, JDK 16부터 정식 스택 포함
		// : 업캐스팅 객체 instanceof 하위클래스
	
	}

}

class Test7 {
	int a = 10;
	
	public void print() {
		System.out.println(a);
	}
}
