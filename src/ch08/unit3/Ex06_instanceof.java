package ch08.unit3;

public class Ex06_instanceof {
	public static void main(String[] args) {
		Test6 t = new Test6();
		System.out.println(t); //ch08.unit3.Test6@3b6eb2ec Test6의 객체로 출력. 
		t.print();//자기 자신의 메소드
		
		//up-casting
		Demo6 d = new Demo6();
		Test6 t2 = d; 
		System.out.println(t2); //ch08.unit3.Demo6@6e8dacdf  Demo6의 객체로 출력. 다운 캐스팅했기 때문
		Test6 t3 = new Demo6();
		Object o = new Demo6();
		
		System.out.println(t2.b); //필드는 무조건 자기(Test6) 거
		//System.out.println(o.b); //컴오류 Object에 b가 없음
		System.out.println(((Demo6)o).b); //down-casting
		
		t3.print();//하위 클래스의 재정의된 메서드 호출
		
		//Demo6 d2 = (Demo6)t; // 런타임오류. 업캐스팅만 다운캐스팅 가능. t는 업캐스팅 없음.
		//instanceof 연산자
		// : 객체가 해달 클래스 객체인지 확인
		// : 
		
		if( t instanceof Demo6) {
			Demo6 d2 = (Demo6)t;
			d2.sub();
		}else {
			System.out.println("Demo6의 객체가 아닙니다.");
		}
	
		
		if( t2 instanceof Demo6) {
			Demo6 d2 = (Demo6)t2;
			d2.sub();
		}else {
			System.out.println("Demo6의 객체가 아닙니다.");
		}
		
		
	}

}

class Test6 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println("a: "+a+", b: "+b);
	}
	
	public void disp() {
		System.out.println("disp...");
		
	}
}

class Demo6 extends Test6 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a: "+a+", b: "+b+", super.b: "+super.b+", c: "+c);
	}
	
	public void sub() {
		System.out.println("sub...");
	}
}