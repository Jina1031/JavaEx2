package ch08.unit3;

public class Ex02 {
	public static void main(String[] args) {
		Test2 t = new Demo2(); //up-casting (상위 클래스가 하위 클래스의 객체를 참조)
		
		t.disp(); //상위 클래스의 메소드 호출
		t.print(); //오버 라이드 한 메소드는 하위 클래스의 메소드 호출
		//t.write(); 컴오류
		
		//down casting
		// : up-casting 한 객체를 다시 원래 객체로 개스팅하는 것
		// : down-casting은 up-casting한 객체만 가능
		// : down-casting은 반드시 강제 캐스팅을 명시 해야함
		
		
		Demo2 dm = (Demo2)t;
		dm.write();
		((Demo2)t).write();
		
		//Test2 t2 = new Demo2();
		//Demo2 dm2 = (Demo2)t2; 
		    // => down-casting 아님. t2가 up-casting이 되어 있지 않기 때문에.
		
		//Test2 t2 = new Demo2();
		//Demo2 dm2 = (Demo2)t2; 
		
	}

}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println("a : "+a+", b :"+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int c = 200;
	
	public void print() {
		System.out.println("a: "+ a + ", b :"+b+", super.b: "+super.b+", c: "+c );
	}
	
	public void write() {
		System.out.println("write...");
	}
}