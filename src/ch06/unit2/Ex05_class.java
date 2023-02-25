package ch06.unit2;
//클래스 변수
public class Ex05_class {

	public static void main(String[] args) {
		// 클래스 변수(static)
		//   : 객체 생성과 상관없이 언제나 사용 가능한 변수 ->객체로 접근해도 되는데 지양
		//   : 객체가 여러개 생성되어도 클래스가 메모리에 로딩될 때 한 번만 메모리 할당
		//   : 클래스 이름을 이용하여 접근 클래스이름.클래스변수명
		System.out.println("Test5.c= "+Test5.c);//접근 가능. 
		
		
		// 인스턴스 변수
		//   : 객체가 생성되어야 접근 할 수 있는 변수
		//   : 객체가 생성될 때 메모리가 할당되며 객체 개수만큼 메모리 할당 
	    //   : 객체를 이용하여 접근 객체명.인스턴스변수명
		Test5 obj=new Test5();
		System.out.println("obj.a= "+obj.a);//0 초기값 출력
		obj.a=10;
		System.out.println("변경 뒤의 obj.a= "+obj.a);
//		obj.b=10; //컴파일 오류. private 외부접근 불가.
		obj.write();
		
		
		//클래스 메소드 : 객체 생성과 상관 없이 바로 호출 가능. 
		//    클래스명.클래스메소드명() 같은 형식으로 호출
		Test5.sub(); //클래식 메소드 호출
		System.out.println(Test5.c);//클래식 변수 호출 가능
		
		
	}  

}


class Test5 {
	//인스턴스 변수: 객체를 생성해야 접근 가능한 변수
	int a; //(default) 동일한 패키지 내에서 접근 가능.
	private int b=20; //클래스 내에서만 접근 가능
	
	//클래스 변수: 객체를 생성과 상관 없이 클래스 메모리에 로딩되는 순간 메로리를 할당 받아 바로 접근 가능한 변수
	public static int c=30;
	
	//인스턴스 메소드: 객체를 생성해야 접근할 수 있는 메소드
	public void write() { //인스턴스 메소드: 객체를 생성해야 접근할 수 있는 메소드
		System.out.println(a+":"+b+":"+c);

	}
	
	public static void sub() {//클래스 메소드: 객체 생성과 상관 없이 호출 가능한 메소드
      //System.out.println(a); //a b 는 메모리 할당을 무조건 받아야 사용 가능. 근데 지금 안되어 있음. 그래서 사용 불가. 
		//인스턴스 변수는 메모리 할당을 받아야 하는데 호출한 곳에서 메모리 할당이 불필요한 클래식 메서드 안에 들어있으면 안됨.
		//클래스 메소드는 할당할 필요가 없어서 인스턴스 변수 사용 불가
		System.out.println(c);
	}
	
	
	
}