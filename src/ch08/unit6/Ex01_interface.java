package ch08.unit6;

public class Ex01_interface {
	public static void main(String[] args) {
		//Test1 t = new Test1(); //인터페이스 객체 생성 불가
		Test1 t = new TestImpl1(); //up-casting 인터페이스는 상위 클래스와 비슷한 개념. 상위 클래스가 하위 클래스 참소
		t.disp(); //재정의된 메소드 호출
		
		//t.sub(); //컴오류. Test1 인터페이스 안에는 sub 메소드가 없음.
		((TestImpl1)t).sub(); //down-casting 
		
		System.out.println(Test1.B); //B값 은 상수이기 때문에 (final 변수) 값 변경 불가. 호출은 가능.
		                             //static 변수이기 때문에 클래스이름.변수명 으로 접근 가능
	}
}
//interface : 선언만 있고 정의가 없는 추상 클래스의 일종, 설계도 개념
interface Test1 {
	//인터페이스 필드는 static final 만 가능
	public static final int A = 10;
	int B = 20; //public static final를 붙이지 않아도 public static final로 자동전환
	
	//인터페이스 메소드는 public abstract 만 가능
	public abstract void disp();
	void print();// default = public abstract으로 자동 전환
//	public void write() {} //메소드를 정의하면 컴파일 오류
}	

//인터페이스 구현
// : 추상 클래스(abstract)가 아닌 경우 인터페이스의 모든 메서드를 재정의 해야한다
class TestImpl1 implements Test1 {

	@Override
	public void disp() {
		System.out.println("disp-인터페이스 메소드 재정의");
	}

	@Override
	public void print() {
		System.out.println("print-인터페이스 메소드 재정의");
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}