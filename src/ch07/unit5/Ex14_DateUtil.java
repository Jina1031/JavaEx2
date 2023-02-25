package ch07.unit5;

public class Ex14_DateUtil {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		
		System.out.println("2000-02-28: "+ util.IsValidDate("2000-02-28"));
		System.out.println("2000-02-30: "+ util.IsValidDate("2000-02-30"));
		System.out.println("2000/02/30: "+ util.IsValidDate("2000/02/30"));
	}

}
