package ch07.unit3;

public class Ex04_Double {

	public static void main(String[] args) {
		double d;
		String s;
		
		s= "123.5";
		//문자열을 double 형으로 
		d = Double.parseDouble(s);
		System.out.println("Double.parseDouble: " + s);
		
		d = Double.valueOf(s);
		System.out.println("Double.valueOf: "+s);
				
	}

}
