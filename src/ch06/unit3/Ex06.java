package ch06.unit3;

public class Ex06 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		int a;
		
		a = 10;
		t.sub1(a); //sub1(int a)와는 다른 a
		System.out.println("sub1() 메소드 호출 후 a : "+ a);// a=20 찍혀야 하는데 10이 찍힘
		
		t.sub2(t);
		System.out.println("sub2() 메소드 호출 후 x : "+ t.x); //참조변수를 매개변수로
		
		int[] nn= {1,3,5,7,9};
		t.sub3(nn);
		System.out.println("sub2() 메소드 호출 후 nn[1] : "+ nn[1]);
	}

}


class Test6 {
	int x=10;
	
	public void sub1(int a) { //call by value: 실매개변수(main a)와 형식매개변수(매개변수)가 기억공간을 따로 확보, 값이 돌아가지 않음
		a=a+10;
	}
	
	//참조형 매개변수
	public void sub2(Test6 tt/*Test6의 참조변수*/) { // call by reference(객체가 전송)
		                                       //매개변수가 주소를 받아서 메소드 호출
		tt.x +=100;
	}
	
	public void sub3(int[] aa) { // 참조형 배열을 매개변수로 주소를 넘김
		aa[1]+=100;
	}
}