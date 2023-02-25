package ch08.unit4;

public class Ex01_final {
	public static void main(String[] args) {

	}

}


//final 인스턴스 변수
// : 선언할 때 또는 초기화 블럭이나 생성자에서 반드시 초기화 해야함
//final 변수
// : 한번만 초기화 가능
//static final 변수
// : 변수 선언시, 또는 static 초기화 블럭에서 초기화
class Test1 {
	//final 인스턴스 변수
	final int a; 
	final int b=10;
	
	//static final 변수
	final static int A;
	final static int B= 10;
	
	static {
		A=100;
	}
	
	
	public Test1() {
		a=5;
      //b=20; b는 앞에서 초기화 했기 때문에 초기화 불가
	}
	
	
	public void sub(final int n) { //매개변수 final
		//n=5; 컴오류 값 변경 불가.
		final int x = 10; //지역변수 final 값 변경 불가
		
		System.out.println(n+x);
	}
}
