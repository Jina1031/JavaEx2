package ch06.unit3;

public class Ex13_overloading {

	public static void main(String[] args) {
		Test13 t = new Test13();
		int a;
		double b;
		
		a=t.area(10, 5);
		t.write(a);
		
		b=t.area(10); 
		t.write(b);
		
		t.write("사각형", a); //double 은 int 받을 수 있기 때문.
		t.write("원", b);		
		
	}

}
//overloading

class Test13 {
	public int area(int w, int h) {
		return w * h;
	}

	public double area(int r) {
		return 3.141592*r*r;
	}

	public void write(double s) {
		System.out.println("원 : " +s);
	}
	
	public void write(int s) {
		System.out.println("사각형 : " +s);
	}

	public void write(String title, double s) {
		System.out.println(title+ " : " +s);
	}
	
	

}
