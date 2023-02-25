package ch06.unit3;

public class EX09 {

	public static void main(String[] args) {
		Test9 ob=new Test9();
		ob.print(3);
	}

}


class Test9 {
	public void print(int n) {
		System.out.print("start :" + n+" ");
		
		if(n>1) {
			print(n-1);
			print(n-1);
		}
		
		System.out.println("end : "+ n);
	}
}