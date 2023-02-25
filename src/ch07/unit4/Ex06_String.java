package ch07.unit4;

public class Ex06_String {

	public static void main(String[] args) {
		String p, s;
		
		p = "\\d{1,3}"; //숫자 1~3자리. 최소 1자리 최대 3자리. 문자열로 계산
		
		s = "123";
		System.out.println(s.matches(p)); //true
		//정규식 패턴에 일치하면 true 아니면 false
		
		s = "1234";
		System.out.println(s.matches(p)); //false
		
		//한글의 시작글자 - 마지막 글자, 가-힣
		// ^ : 시작 $ : 끝 + : 1개 이상
		p = "^[가-힣]+$";
		s = "김ㅋ나";
		System.out.println(s.matches(p)); //false
		
		s = "김가나";
		System.out.println(s.matches(p)); //true
		
		p = "[가-힣]"; //한글
		s = "자바 5 스프링 7";
		s = s.replaceAll(p, "");
		System.out.println(s);// 5  7
		
		
		// \\b : 단어 경계(공백을 기준으로 단어를 지움)
		p = "[가-힣]+\\b";
		s = "자바 스프링5"; // '자바 ' 까지 지움 스프링5는 숫자가 포함이라 제외
		s = s.replaceAll(p, "");
		System.out.println(s);// 스프링5
		
		p = "010-\\d{4}-\\d{4}"; //전화번호 형식
		s = "010-1111-1111";
		System.out.println(s.matches(p)); //true

		//숫자가 아닌 것을 *로
		p = "우리 12 abc 67 & 79";
		s = p.replaceAll("[^0-9]", "*"); //^가 [] 안에 있으면 부정
		System.out.println(s);
	}

}
