package ch08.unit6;

public class Ex07_interface {
	public static void main(String[] args) {
		//인터페이스의 익명 구현 - 일회성
		//인터페이스 구현하는 걸 새로 클래스를 만들어서 하는 게 아니라
		//인터페이스 객체를 통한 이름없는 클래스를 통해서 구현. 
		
		//Anonymous Inner Type : Ex07$1.class 의 이름으로 클래스 파일이 만들어짐
		//이름이 없는 클래스. 익명 구현 클래스.
		Demo7 obj = new Demo7() {
			
			@Override
			public void disp() {
				System.out.println("disp...");
			}
		};
		obj.disp();
	}
}

interface Demo7{
	public void disp();
}

