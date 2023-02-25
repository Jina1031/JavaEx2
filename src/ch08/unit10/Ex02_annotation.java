package ch08.unit10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Ex02_annotation {
	public static void main(String[] args) {
		TestService ts = new TestService();
		ts.execute();
	}

}
@Target(ElementType.METHOD) //어노테이션 적용 부분
@Retention(RetentionPolicy.RUNTIME) //어노테이션 유지시간. 프로그램을 실행했을 때도 어노테이션 유지
@interface MyAnno { //어노테시션
}

class TestService {
	@MyAnno
	public void execute() {
		System.out.println("어노테이션...");
	}
}