package ch06.unit2;

public class Rectagle {
	//필드(멤버변수)
	private int width;
	private int height;
	
	//생성자
	public Rectagle(int w, int h) {
		width=w;
		height=h;
	}
	
	//메소드(기능)
	//하나의 메소드는 하나의 기능만
	public int area() { //넓이
		int result = width*height;
		
		return result;
	}

	public int len() { //둘레
		return(width+height)*2;
	}
}
