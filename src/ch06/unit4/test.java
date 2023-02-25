package ch06.unit4;

class Target{
	private int i =0;
	String name="김자바";
/*	
	public String getName() {
		return name;
	
	}
*/	
	public int addOne() {
		return ++i;
	}
}
public class test {

	public static void main(String[] args) {
//		Target t=new Target();
//		t.name="자바";
		System.out.println(new Target().addOne());
	}

}
