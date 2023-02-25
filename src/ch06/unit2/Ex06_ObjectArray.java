package ch06.unit2;

public class Ex06_ObjectArray {
/*
  객체 배열
 */
	public static void main(String[] args) {
		
/*		
		Test6 t;
		t.a=10; //컴파일 오류 발생  초기화가 되어 있지 않아서 안됨.
		
		t는 초기화 하지 않아서 컴파일 오류
*/
	

/*		
		Test6 t= null;
		t.a=10; //런타임 오류. NullPointorExcetption
		
		t는 null로 초기화 시킨 상태여서 메모리 할당이 안되어서 런타임 오류
*/		
	
		
		
		//객체 배열
		Test6[] tt=new Test6[5]; //배열 생성 완료
		      //Test6 객체를 5개 저장할 수 있는 배열
		      //메모리를 할당하여 객체를 생성한게 아님
		      //클래스의 객체가 메모리 할당을 받을 수 있는 유일한 방법은 new 생성자();/생성자 호출/
		      //Test6 t1=null,t2=null, t3=null, t4=null, t5=null한 것과 유사
		      //객체에 대한 배열은 null로 초기화
		
//		tt[0].a=10; 
		//System.out.print(tt[0]) 은 null이 출력되고 런타임 오류가 나지 않음.
		//하지만 뒤에 변수나 메소드를 호출할 때는 null값에서 호출할 수 없기 때문에 런타임 오류.
		
		//메모리 할당 안됨 런타임 오류 NullPointorExcetption
		//생성자 호출하지 않아서 메모리 할당이 안된 상태
//		System.out.println(tt[0].a);
		
		for(int i=0;i<tt.length;i++) {
			tt[i]=new Test6(); //객체에 대한 메모리 할당
		}
		
		tt[0].a=10;
		tt[0].print();
		
	}

}

class Test6{
	int a;
	int b;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
//	int b;   필드(인스턴스 변수)는 아래에 선언해도 됨. 필드는 위에 선언하는 게 헷갈리지 않고 좋음
}