package ch08.unit11;

public class Ex01_record {
	public static void main(String[] args) {
		Test obj = new Test(10, 5);
		System.out.println(obj.getX()+", "+ obj.getY()); //final 변수라서 값 변경 불가
	}

}

final class Test {
	private final int x;
	private final int y;
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}