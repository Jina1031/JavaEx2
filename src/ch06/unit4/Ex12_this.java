package ch06.unit4;

public class Ex12_this {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		
		obj.set(10);
		obj.print();
		obj.write();
		System.out.println();
		
		//this.a: 10, this.b: 110, this.c: 5, c:100
		//this.a: 10, this.b: 110, this.c: 5
		
		Demo2 obj2 = new Demo2();
		
		obj2.set(5);
		obj2.print();
		obj2.write();
		System.out.println();
		
		//this.a: 10, this.b: 105, this.c: 5, c:100
		//this.a: 10, this.b: 105, this.c: 5
		
		//객체가 두 개이기 때문에 인스턴스 메모리도 두 개. 
	}

}

class Demo2 {
	private int a;
	private int b;
	private int c=5;
	
	//this
	// :호출한 객체를 나타내는 키워드
	// :static 메소드에서는 사용 불가
	public void set(int b) {
		this.a=10; //this.a = obj.a | 호출한 객체의 인스턴스 변수. 
		           //메소드 안에는 a라는 이름의 지역변수가 없기 때문에 this 생략 가능. 필드 a
		this.b=b+100; //this.b는 필드. b는 매개변수. 절대 this생략 불가. 필드 b + 매개변수 b
	}
	
	public void print() {
		int c=100;
		System.out.println("this.a: "+ this.a+ ", this.b: "+this.b+", this.c: "+this.c+", c:"+c);
		//System.out.println("this.a: "+ this.a+ ", this.b: "+this.b+", this.c: "+this.c+", c:" +c);
		//this.c=필드, c= 지역변수
	}
	
	public void write() {
		System.out.println("this.a: "+ this.a+ ", this.b: "+this.b+", this.c: "+this.c);
	}
}

