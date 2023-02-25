package ch06.unit4;

public class Ex14_this {

	public static void main(String[] args) {
		Demo4 obj=new Demo4("김자바",0); //인자 두 개인 생성자
		
		obj.print(); //name: "김자바" , age: 미성년자
	}

}

class Demo4 {
	private String name;
	private int age;
	
	public Demo4() {
		System.out.println("인자 없는 생성자");
	}
	
	public Demo4(String name) {
		this(name, 0);  //다른 생성자 호출(다른 생성자의 몸체를 실행)
		                 //생성자의 최상단에 한 번만 사용 가능.
		System.out.println("인자 하나인 생성자");
	}

	//이 메소드에 소스가 이미 짜있기 때문에 이 소스를 그냥 사용하고 싶지 소스를 중복 생성하고 싶지 않음.
	//이 메소드의 몸체만 실행하고 싶을 때는 this(name, age) 사용
	public Demo4(String name, int age) {
		System.out.println("인자 두 개인 생성자");
		this.name=name;
		this.age=age;
	}
	
	public void print() {
		System.out.println("name: "+name + ", age: "+ (age>=19? "성인" : "미성년자"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}