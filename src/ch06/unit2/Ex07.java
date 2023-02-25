package ch06.unit2;

public class Ex07 {
	int r;
	static int y=10; //클래스 변수(static 변수) 인스턴스 메서드, 클래스 메서드에서 둘 다 사용 가능. 
	
	public double area() {
		return 3.141592*r*r;
	}
	
	public double len() {
		return 3.141592*2*r;
	}
	
	
	public static void main(String[] args) {
		Ex07 obj=new Ex07(); //메모리 할당
		obj.r=10;
/*		
		//지역변수는 메서드가 호출될 때 메모리 할당을 받음
		int x; //메서드가 호출되고, 선언된 부분에서 메모리 할당이 일어남. 
		x=10; 
*/
		
		double a, b;
		a= obj.area(); //r=10을 넣고 출력
		b= obj.len(); //r=10을 넣고 출력
		
		System.out.println("넓이: "+ a+", "+"둘레"+b);
		
		System.out.println(y); //클래스 변수(static 변수)는 클래스 메서드 안에서 가능.
		
	
	}

}
