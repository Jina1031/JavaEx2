package ch08.unit6;

public class A{
	public static void main(String[] args)  {
		B b = new B(); 
		int[] arr = {10, 20, 30};
		System.out.println(arr[0]); //10
		
		b.sub(arr);
		System.out.println(arr[0]); //7
	}
}

class B {
	public void sub(int[] n) { //배열의 참조변수 대입 
		n[0] = 7; // 매개변수 배열의 [0]번째 변경
	}
}

