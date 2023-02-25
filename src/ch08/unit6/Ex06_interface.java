package ch08.unit6;

public class Ex06_interface {
	public static void main(String[] args) {

		System.out.println(Demo6.sum(10)); //static 메소드 호출 가능. 인터페이스명.메소드명
		
		Demo6 ob = new DemoImpl6();
		System.out.println(ob.max(5, 10));
	}
}

interface Demo6 {
	public void write();
	
	//static 메소드(인터페이스에서 메소드 구현할 때 필수 키워드)
	//JDK 8부터 가능. 인터페이스명을 이용하여 바로 호출 가능
	public static int sum(int n) {
		int s=0;
		for(int i=1; i<=n;i++){
			s+=i;
		}
		return s;
	}
	
	//default 메소드(인터페이스에서 메소드 구현할 때 필수 키워드)
	// : 인터페이스에서 메소드 구현 
	// : JDK 8부터 가능
	// : 구현 클래스에서 재정의 가능
	public default int max(int m, int n) {
		return m >n ? m: n;
	}
}

class DemoImpl6 implements Demo6 {

	@Override
	public void write() {
		System.out.println("write...");
	}
	
}