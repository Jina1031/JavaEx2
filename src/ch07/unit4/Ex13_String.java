package ch07.unit4;

public class Ex13_String {

	public static void main(String[] args) {
		String s;
		s = "자바"+", 스프링"+", 오라클"+", HTML";
		//내부적으로 StingBuilder로 처리하기때문에 서능이 우수
		System.out.println(s);
		
		//가변문자열 
		//아래처럼 코딩하면 욕을 많이 먹음 *^^*
		/*
		s="자바";
		s += ", 스프링";
		s += ", 오라클";
		s += ", HTML";
		System.out.println(s);
		*/
		//String은 수정이 안되기 때문에 매번 += 할 때마다 다른 메모리를 할당하면서 생성됨.
		
		//이런 가변문자열은 StringBuilder로 처리
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		sb.append(", 스프링");
		sb.append(", 오라클");
		sb.append(", HTML");
		System.out.println(sb);
		
		//multiline String : JDK13 에서 priview로 제공하고 JDK 15부터 스팩에 포함
		s = """
		SELECT hak, name, kor, eng, mat
		FROM score
		WHERE hak?
    	""";
		System.out.println(s);
		
	}

}
