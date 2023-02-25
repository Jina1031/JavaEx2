package ch08.unit3;

public class Ex04 {

	public static void main(String[] args) {
		Object obj = new Test4();
		System.out.println(obj);
		//Object의 toString() : 클래스이름@해시코드
		//Object의 toString()를 재정의 했기 때문에 a:10 출력
		
		//System.out.println(obj.a); 컴오류 다운 캐스팅 필요
		System.out.println(((Test4)obj).a); //10
		((Test4)obj).print(); //10
	}
}

class Test4 {
	int a = 10;
	public void print() {
		System.out.println(a);
	}

	@Override
	public String toString() {
		return "a: "+a;
	}
	
}