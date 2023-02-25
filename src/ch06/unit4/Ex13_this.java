package ch06.unit4;

public class Ex13_this {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		//obj.name= "김자바"; //private라서 컴오류 발생. 외부에서 접근 불가 
		//-> 값을 넣는 것을 setter, 값을 불러오는 것을 getter
		obj.setName("김자바");
		obj.setAge(20);
		String s=obj.result();
		
		System.out.println(obj.getName() + ":" + obj.getAge() + ":"+ s);
				
	}

}

//setter, getter : <shift> + <alt> + S R A
//source-> getters and setters
class Demo3 {
	//필드는 private로 만들어야 함
	private String name;
	private int age;
	
	//대신 메소드를 public으로 만들어서 접근 가능하도록함
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
	
	public String result() {
		return this.age >= 19? "Adult" : "Child";//this 생략 가능
	}
	
	
}