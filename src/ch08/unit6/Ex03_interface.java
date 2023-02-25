package ch08.unit6;

public class Ex03_interface {
	public static void main(String[] args) {
		Store st = new Store();
		
		st.sell(new Apple()); //Fruit 구현한 클래스의 객체
		st.sell(new Orange()); //Fruit 구현한 클래스의 객체
	}
}

/*
 인터페이스 쓰면 이점
 -클래스 간의 결합도(의존 관계)를 낮출 수 있음
 -표준화가 가능
 -개발 시간도 단축
 */
interface Fruit {
	public int getPrice();
	public String getName();
}

class Apple implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
}

class Orange implements Fruit {

	@Override
	public int getPrice() {
		return 900;
	}

	@Override
	public String getName() {
		return "오렌지";
	}
}

class Store {
	public void sell(Fruit a) { //의존성을 가지고 있지 않음. Fruit를 구현한 클래스의 객체라면 다 가능.
		System.out.println(a.getName() +", "+ a.getPrice());
	}
}

/*
class Store2 {
	public void sell(Apple a) { //Apple 클래스에 의존성이 강하고 Orange는 판매할 수 없는 클래스 
		System.out.println(a.getName() +", "+ a.getPrice());
	}
}
*/
