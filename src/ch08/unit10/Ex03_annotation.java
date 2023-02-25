package ch08.unit10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Ex03_annotation {
	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.sub1(); //실행 1
		System.out.println();
		
		//Test3 클래스의 모든 메소드 정보
		Method[] mm = Test3.class.getDeclaredMethods();
		for(Method m : mm) {
			//System.out.print(m.getName()); // sub sub1 sub2 sub3
			
			//어노테이션 적용 됐는지 여부 확인
			if(m.isAnnotationPresent(MyPrint.class)) {
				//System.out.println(m.getName());  //sub1 sub2 sub3
				
				// 메소드 이름 출력
				MyPrint mp = m.getAnnotation(MyPrint.class);
				System.out.println("["+m.getName()+"]"); //[sub1] [sub2] [sub3]
				
				//구분선
				for(int i=0;i<mp.number();i++) {
					System.out.print(mp.value()); 
					/*
					 [sub3]
                     ####################
                     [sub2]
                     ***************
                     [sub1]
                     ---------------
					 */
				}
				System.out.println();
				
				try {
					//메소드 호출
					m.invoke(obj);
				} catch (Exception e) {
				}
			}
		}
	}

}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyPrint {
	// 어노테이션 속성 설정
	// default는 초기값
	
	public String value() default "-"; 
	public int number() default 15;
}

class Test3 {
	public void sub() {
		System.out.println("실행...");
	}
	
	@MyPrint
	public void sub1() {
		System.out.println("실행 1"); //"-" 15개 + 실행 1
	}

	@MyPrint("*")
	public void sub2() {
		System.out.println("실행 2"); //"*" 15개 + 실행 2
	}
	
	@MyPrint(value = "#", number = 20)
	public void sub3() {
		System.out.println("실행 3"); //"#" 20개 + 실행 3
	}
}