package ch08.unit11;

public class Ex03_record {
	public static void main(String[] args) {
		//Person p = new Person("김자바", -1); //런타임 오류
		Person p = new Person("김자바", 10);
		System.out.println(p.name()+":"+p.age()); //김자바:10

	}

}

record Person(String name, int age) {
	//컴팩트 생성자(compact Constructor)
	public Person {
		if(age < 0) {
			throw new IllegalArgumentException("나이는 0 이상이다");
		}
		
		//this.name = "홍길동"; // 컴파일 에러. this 키워드 사용불가
		//name = "김자바"; // 가능		
	}
}
/*
  - 컴팩트 생성자(compact Constructor)
    : 생성자 매개변수를 받는 부분이 사라진 형태
    : 컴팩트 생성자를 이용하여 생성자 매개변수의 validation 로직 등을 넣을 수 있음
    : this 키워드는 사용 불가
    : 표준 생성자와 혼용 가능
*/
