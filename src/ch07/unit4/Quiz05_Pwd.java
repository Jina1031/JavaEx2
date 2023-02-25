package ch07.unit4;

public class Quiz05_Pwd {
	public static void main(String[] args) {
		Test5 t = new Test5();
		
		System.out.println(t.generatePwd());
		System.out.println(t.generatePwd());
		System.out.println(t.generatePwd());
	}

}

class Test5 {
	//10자리 패스워드 생성. 영문자, 숫자, 특수문자 혼합
	public String generatePwd() {
		StringBuilder sb = new StringBuilder();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890~!@#$%^&*";
		
		for(int i=0; i<10;i++) {
			int a=(int)(Math.random()*s.length());
			sb.append(s.substring(a, a+1)); //a번째 문자가 더해짐
//			sb.append(s.charAt(a)); //a번째 문자가 더해짐
			
		}
			
		return sb.toString();
		
	}
}