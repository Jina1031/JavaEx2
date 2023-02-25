package ch07.unit4;

public class Ex07_String {

	public static void main(String[] args) {
		String s;
		int n ,m;
		
		n = 12345;
		System.out.printf("%,d%n", n); //세자리마다 , 출력
		s = String.format("%,d", n); //서식에 맞추어 문자열로 변환
		System.out.println(s);
		
		n=10; m=15;
		s= String.format("%d %d %d %d", m, n, m, n);
		System.out.println(s);

		n=10; m=15;
		s= String.format("%1$d %2$d %1$d %2$d", m, n);
		System.out.println(s);
		
		float f = 12.3345f;
		System.out.printf("%f\n", f);
		System.out.printf("%.2f\n", f); //소수점 아래 두자리까지 출력
		System.out.format("%.2f", f); //소수점 아래 두자리까지 출력
/*		
		s="자바,오라클,HTML,CSS,Jacascript";
		String[] ss= s.split(","); //특정 패턴으로 문자열을 분리하여 배열로 전환
		//ss[0] = 자바, ss[1] = 오라클 등
		
		for(String a:ss) {
			System.out.print(a+ " "); //자바 오라클 HTML CSS Jacascript
		}
		System.out.println();
		
		s= "010-1111-2222";
		String[] tt = s.split("-");
		System.out.println(tt[0]+":"+tt[1]+":"+tt[2]); //010:1111:2222
		
		s= "korea";
		byte[] bb = s.getBytes(); //각 문자열에 대한 ASCII코드값을 byte 배열로 반환
		for(byte b: bb) {
			System.out.print(b+" "); //107 111 114 101 97 
		}
*/		
	}

}
