package ch07.unit4;


public class Ex14_String {

	public static void main(String[] args) {
		Test14 t= new Test14();
		
		t.stringTime();//문자열 길이: 100000, 처리시간: 1158ms
		t.stringBuilderTime();//문자열 길이: 100000, 처리시간: 3ms
		t.stringBufferTime();
	}
}

class Test14 {
	public void stringTime() {
		System.out.println("String...");
		
		//currentTimeMillis: 컴퓨터 시스템 시간을 millisecond로 환산하여 반환. 
		long start = System.currentTimeMillis();
		String s= "a";
		
		for(int i=1; i<100000; i++) {
			s += "a";
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이: "+s.length()+", 처리시간: "+ (end-start)+"ms");
		//끝난 시간 - 시작한 시간 = 걸리는 시간
		System.out.println();
	}
	
	public void stringBuilderTime() {
		System.out.println("StringBuilder...");
		
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		
		for(int i =1; i<100000;i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이: "+sb.length()+", 처리시간: "+ (end-start)+"ms");
		System.out.println();
				
	}
	
	public void stringBufferTime() {
		System.out.println("StringBuffer...");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		
		for(int i =1; i<100000;i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("문자열 길이: "+sb.length()+", 처리시간: "+ (end-start)+"ms");
		System.out.println();
		
	}
}