package ch07.unit4;

public class Quiz04_Bank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String s;
		
		s= bank.generateAccountN0();
		System.out.println(s);
		
		s= bank.generateAccountN0();
		System.out.println(s);
		
		s= bank.generateAccountN0();
		System.out.println(s);
		
	}
}

class Bank {
	//뒤에 일곱자리 다음 문자열 만들기
	private String accountNo="020-08-0000170";
	
	public String generateAccountN0() {

		//020-08-   0000170 분리
		//String s1= accountNo.substring(0, 7);
		//String s2= accountNo.substring(7);
		
		String s1= accountNo.substring(0, accountNo.lastIndexOf("-")+1);// last"-" 찾아서 그 index+1
		String s2= accountNo.substring(accountNo.lastIndexOf("-")+1);
		
		//s2 정수로 변환
		int n = Integer.parseInt(s2) +1;
		
		accountNo=s1+String.format("%07d", n); // %07d = 7자리인데 남는 거 0으로 채워서 출력 
		
		return accountNo;
	}
}