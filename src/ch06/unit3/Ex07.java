package ch06.unit3;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7();
		
		t.write(7);
	}

}
//재귀 호출
//재귀호출은 종료조건을 주지 않으면 StackOverflowError이 발생되어 프로그램이 종료

class Test7 {
	public void write(int n) { // 인스턴스 메소드는 Stack에 메모리 쌓음 
		if(n>1) { // 7 6 5 4 3 2 1 
			write(n-1);//자기를 부름.
		}
		System.out.printf("%5d", n); // 1 2 3 4 5 6 7 -> push 한 순서와 pop한 순서가 다름
		//조건에 맞을 때까지 메모리를 쌓아두다가 조건문 벗어나면 쌓아두었던 메모리 뱉어내기 시작.
	}
}