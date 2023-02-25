package ch06.unit2;

public class Ex04_class {

	public static void main(String[] args) {
		//레퍼런스(참조)변수 선언과 메모리 할당
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		
		//객체 값을 가지고 있는 것이 아니라 주소를 가지고 있음
		//클래스이름@해시코드 출력
		//해시코드: 객체를 빠르게 찾기위해 JVM이 사용하는 값
		System.out.println(t1); //ch06.unit2.Test4@7c30a502
		System.out.println(t2); //ch06.unit2.Test4@49e4cb85
		
		t1.write();//10:0
		t2.write();//10:0
		
		System.out.println(t1==t2);// 주소값 비교 false
		
		t1.b=100;
		
		t1.write();//10:100
		t2.write();//10:0
		
		Test4 t3= new Test4();
		Test4 t4= t3; //t3과 t4가 참조하는 영역이 동일
		t3.b=40;
		t3.write();//10:40
		t4.write();//10:40
		//주소값이 넘어갔기 때문

		System.out.println(t3==t4);//true 주소가 같기 때문에 
		
		//동일한 객체는 해쉬코드가 같다
		//하지만 해쉬코드가 같다고 동일한 객체는 아니다.
		System.out.println(t3);//ch06.unit2.Test4@2133c8f8
		System.out.println(t4);//ch06.unit2.Test4@2133c8f8
		
	}

}


class Test4{
	int a=10;
	int b;
	public void write() {
		System.out.println(a+":"+b);
	}
}