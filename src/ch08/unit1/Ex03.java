package ch08.unit1;
/*
 하위 클래스의 객체 생성
  1) 상위 클래스의 필드 메모리 할당, 기본 값 초기화, 초기화 수식 실행 
  2) 하위 클래스의 필드 메모리 할당, 기본 값 초기화, 초기화 수식 실행   
  3) 상위 클래스의 초기화 블럭 실행
  4) 상위 클래스의 생성자 몸체 실행
  5) 하위 클래스이 초기화 블럭 실행
  6) 하위 클래스의 생성자 몸체 실행 
 */
public class Ex03 {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		
		d.disp();
		//Test3 생성자...
		//Demo3 생성자...
		//a: 10, x: 100

	}

}


class Test3 {
	int a = 10;
	
	public Test3() {
		System.out.println("Test3 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo3 extends Test3 {
	int x = 100;
	
	public Demo3() {
		super(); // 상위 클래스의 생성자 몸체를 호출
		         // 없으면 컴파일러가 자동 생성, 상위 클래스의 디폴트 생성자를 호출
		         // 그래서 상위 클래스 생성자가 먼저 실행
		         // 인위적으로 생성하면 최상단에 써야 함
		System.out.println("Demo3 생성자...");
	}
	
	public void disp() {
		System.out.println("a: "+a+", x: "+x);
	}
}