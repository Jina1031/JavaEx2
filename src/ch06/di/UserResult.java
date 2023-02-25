package ch06.di;

public class UserResult {
/*
	private User user; //메모리 할당 안 함 객체 생성 안됨
	private User user=new User(); 
	UserUI에도  private User user=new User(); 생성
	즉 객체가 두 개 생성된 것. UserUI에서 생성된 객체를 받아야 함
*/
	
	//생성자를 이용한 의존성 주입
	private User user;
	
	public UserResult(User user) {
		this.user = user;
	}
	
	public void printAll() {
		
		UserVO[] list = user.getList(); 
		//NullPointerException
		//user가 null인 상황에서 .getList()가 호출되면서 NullPointerException 발생

		System.out.println("\n이름\t나이\t결과");
		System.out.println("------------------------------");
		for(int i=0; i<user.getCount();i++) {
			UserVO vo = list[i];
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.println(vo.getAdult()+"\t");
		}
		System.out.println();
	}
}
