package ch08.unit9;

public class Ex01_enum {
	public static void main(String[] args) {
		System.out.println(Color.RED); //RED 출력
		//toString()을 재정의하면 원하는 문자열 출력 가능
		
		//열거형 상수의 기수(선언위치) 출력
		for(Color c : Color.values()) {
			System.out.println(c + " -> "+ c.ordinal());
			//RED -> 0
			//GREEN -> 1
			//BLUE -> 2
		}
		System.out.println();
		
		//System.out.println(Color.RED == 0); // 컴오류
		System.out.println(Color.RED.ordinal() == 0); //true
		
		Test1 t = new Test1();
		System.out.println(t.getColor()); //RED
		
		t.setColor(Color.BLUE);
		System.out.println(t.getColor()); //BLUE
		
		Color  color = t.getColor();
		//case 에서 enum 은 enum명 생략 가능(Color 생략 가능)
		switch (color) {
		case RED: System.out.println("red");break;
		case BLUE: System.out.println("blue");break;
		case GREEN: System.out.println("green");break;
		}
	}

}

enum Color {
	RED, GREEN, BLUE 
}

class Test1 {
	private Color color = Color.RED;
	
	public void setColor(Color color) {
		this.color=color;
	}
	
	public Color getColor() {
		return color;
	}
}
