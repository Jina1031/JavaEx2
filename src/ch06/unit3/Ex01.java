package ch06.unit3;

public class Ex01 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		int result;
		
		result= t.sub(5); //메소드 호출, return값 s가 저장.
		//result=s
		System.out.println(result);
		
	}
}

class Test1{
	//접근제어자 리턴값 메소드명(매개변수타입 매개변수명) { 지역변수+코드+리턴값 }
	//매개변수는 지역변수로 메소드 안에서만 사용 가능
	//지역변수(매개변수)는 메소드를 호출할 때 메모리가 할당되고, 메소드를 빠져나가면 메모리가 해제된다. 
	//지역변수는 stack메모리 공간에 저장. 
	
	//인스턴스 메소드
	public int sub(int n) { //n 매개변수
		int s=0;//s는 지역변수
		
		s= n+5;
		for(int i=0;i<s;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		return s;//리턴값 없으면 오류. 반환값을 가지고 호출한 곳으로 감
	}
}
