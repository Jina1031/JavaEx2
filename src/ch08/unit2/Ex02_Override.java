package ch08.unit2;

public class Ex02_Override {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.setName("김자바");
		t.setAge(20);
		
		System.out.println(t.toString()); //ch08.unit2.Test2@3b6eb2ec/ object 의 toString 사용/ 클래스명@해시코드
		System.out.println(t); //ch08.unit2.Test2@3b6eb2ec
		System.out.println(t.getName()+":"+t.getAge());
	}

}

class Test2 {
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
	
	
}