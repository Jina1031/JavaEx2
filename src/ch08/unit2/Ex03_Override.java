package ch08.unit2;

public class Ex03_Override {
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		t.setName("김자바");
		t.setAge(20);
		
		System.out.println(t); //name: 김자바, age: 20
		System.out.println(t.toString()); //name: 김자바, age: 20
	}

}

class Test3 {
	private String name;
	private int age;
	
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
	
	//object의 toString 오버라이드
	//마우스 우측->source=>override
	//혹은 tos까지 치고 ctrl+space
	@Override
	public String toString() {
		return "name: "+ name + ", age: "+ age;
	}
}