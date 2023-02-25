package ch06.unit3;

public class Ex03 {

	public static void main(String[] args) {
		Test3 tt=new Test3(); //인스턴스 메서드 호출을 위한 객체 생성
		
		int s;
		int[] a= {1,3,5,7,9};
		
		s= tt.sum(a);
		System.out.println("결과: "+s);
		
		System.out.println("매개변수 안 준 배열");
		int[] aa=tt.random();
		for(int n:aa) { //주소를 넘겨 받음. 그래서 주소가 남아있을 때까지는 int[] n은 남아있음
			System.out.print(n+ " ");
		}
		System.out.println("\n");
		
		System.out.println("매개변수 준 배열");
		int[] nn=tt.random(5);
		for(int n: nn) {
			System.out.print(n+ " ");
		}
		System.out.println();
		
				
	}
}

class Test3 {
	//인수로 넘어온 배열의 합을 계산하여 반환
	public int sum(int[] num) {
		int s=0;
		
		//향상된 for문
		for(int n : num) { 
			s+=n;
		}

 /*     //일반 for문
		for(int i=0;i<num.length;i++) {
			s+=num[i];
		}
*/		
		return s;
	}
	
	
	//배열반환->배열의 참조값(주소) 반환
	//1~100까지 숫자 중에서 난수 10개를 발생하여 반환하는 메소드
	
	public int[] random() {
		int[] n = new int[10];
		
		for(int i=0;i<n.length;i++) {
			n[i]=(int)(Math.random()*100)+1;
		}
		
		return n; //n의 주소를 반환. 주소가 남아있기 때문에 배열은 없어지지 않음. 
	}
	
	
	public int[] random(int count) { //위 메소드의 오버로딩
		int[] n = new int[count];
		
		for(int i=0;i<n.length;i++) {
			n[i]=(int)(Math.random()*100)+1;
		}
		
		return n; //n의 주소를 반환. 주소가 남아있기 때문에 배열은 없어지지 않음. 
	}
	
}