package ch06.unit3;

public class Ex10 {

	public static void main(String[] args) {
		for(int i=0; i<10;i++) {
			System.out.printf("%5d", fibonacci(i)); // 0 1 1 2 3 5 8 21 34
		}
		System.out.println();
	}
	
	public static int fibonacci(int n) { //클래식 메소드
		if(n<2) {
			return n;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
