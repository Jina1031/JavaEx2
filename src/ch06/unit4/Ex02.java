package ch06.unit4;

public class Ex02 {

	public static void main(String[] args) {
//		Test02 ob=new Test02(); //컴파일 오류, 인자가 없는 생성자가 없기 때문. 디폴트 생성자가 없음.
		
		Test02 ob2 = new Test02("김자바", 20); //생성자에서 인자를 줬기 때문
		ob2.print();
		
	}

}

class Test02 {
	private String name;
	private int age;

/*	
	public Test02() { //인자가 없는 생성자.
		
	}
*/
	
	public Test02(String n, int a) { //인자가 있는 생성자.
		System.out.println("인자가 있는 생성자");
		name=n;
		age=a;
	}
	
	//생성자는 중복 정의 가능. 
	
	public void print() {
		String s = age >= 19 ? "성인" : "미성년자";
		
		System.out.println(name + ":" + age + ", " + s);
	}
}