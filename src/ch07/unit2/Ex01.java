package ch07.unit2;
/*
 Object 클래스
 -모든 클래스의 최상위 클래스
 -상위 클래스의 public, protected 접근 제어자의 메소드, 필드는 모든 하위 클래스에서 사용 가능
 */
public class Ex01 {

	public static void main(String[] args) {
		//Test1의 상위 클래스는 Object 
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = t1;
		
		/*
		 Object 클래스의 toString () 메소드
		  -클래스이름@해쉬코드
		  -System.out.println(t1.toString());과
		  System.out.println(t1); 은 동일한 결과 출력(print 에서만)
		 */
		
		System.out.println(t1.toString()); //Object의 toString() 메소드
		System.out.println(t1);
		System.out.println();
		//ch07.unit2.Test1@7c30a502 출력
		
		System.out.println(t1 == t2); //주소 비교 //false
		System.out.println(t1.equals(t2)); //Object의 equals 메소드 //false
		System.out.println(t1 == t3); //true
		System.out.println(); 
		
		//해쉬코드: JVM이 해달 객체를 빠르게 검색할 수 잇도록 만들어지 값
		// 동일한 객체는 해쉬코드 값 동일.하지만 해쉬코드가 같아도 다른 객체일 수 있음.
		System.out.println(t1.hashCode()); //2083562754 10진수
		System.out.printf("%h%n" ,t1.hashCode()); //7c30a502 16진수
		System.out.printf("%x%n" ,t1.hashCode()); //7c30a502 16진수
	}
}

class Test1 {
	int a=10;
	int b=20;
	
	public void print() {
		System.out.println("a: "+a+", b:"+ b);
	}
}