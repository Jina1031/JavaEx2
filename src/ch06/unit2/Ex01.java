package ch06.unit2;

public class Ex01 {
	public static void main(String[] args) {
		int w=10, h=5;
		int a, b;
		
		Rectagle obj=new Rectagle(w, h);
		
		a=obj.area();//넓이
		b=obj.len();//둘레
		
		System.out.println(a+", "+b);
		
		
		
		Rectagle obj2=new Rectagle(10, 20);
		
		a=obj2.area();//넓이
		b=obj2.len();//둘레
		
		System.out.println(a+", "+b);
	}
}

