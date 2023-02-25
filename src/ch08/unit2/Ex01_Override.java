package ch08.unit2;

public class Ex01_Override {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		d.print(); //a: 10, x: 100
		d.write(); //a: 10
		
	}

}

class Test1 {
	int a = 10;
	
	public void print() {
		System.out.println("a: "+a);
	}
}


class Demo1 extends Test1 {
	int x= 100;
	
	public void write() { //자식 클래스의 메소드에
		super.print();    //부모 클래스의 메소드를 호출하도록 함
	}
	
	//상위 클래스 메소드 재정의
	//상위 클래스 메소드 숨겨짐
	@Override//어노테이션: 메소드가 override 규칙에 맞는지를 검증하여 맞지 않으면 컴오류
	public void print() { //오버 라이드
		System.out.println("a: "+a+", x: "+x);
	}
	
	//overloading 중복정의
	public void print(int n) { //오버로딩
		System.out.println("n: "+n);
	}
}