package ch08.unit9;

public class Ex02_enum {
	public static void main(String[] args) {
		System.out.println(City.SEOUL); // 재정의 되어 있지 않으면 SEOUL
		

		System.out.println("서울: "+City.SEOUL.getCount());//1000
		
		System.out.println("\n전체리스트...");
		for(City c: City.values()) {
			System.out.println(c.getName()+":"+c.getCount());
		}
	}

}

// 열거형 상수에 값 할당 - 생성자를 만들어야 함
enum City {
	SEOUL("서울",1000),
	BUSAN("부산",350),
	INCHEN("인천",330);
	
	private String name;
	private int count;
	
	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	private City(String name, int count) {
		this.name=name;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return name + ":" + count;
	}
}
