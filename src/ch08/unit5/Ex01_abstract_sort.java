package ch08.unit5;

public class Ex01_abstract_sort {
	public static void main(String[] args) {
		//SortInt si = new SortInt(); //추상 클래스 객체 생성 불가
		// 추상 클래스는 반드시 하위 클래스가 있고, 하위 클래스를 이용하여 객체를 생성
		
		int[] data = new int[] {40, 50, 30, 25, 35};
		
		//추상클래스        하위클래스
		SortInt si = new BubbleSort();//up-casting
//		SortInt si = new SelectionSort();//up-casting
		
		disp("source data", data);
		
		si.sort(data);
		
		disp("sort data", data);
	}
	
	public static void disp(String title, int[] value) {
		System.out.println(title);
		for(int n : value) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
}

//abstract : 추상
abstract class SortInt { //추상 클래스 객체 생성 안됨
	private int[] value;
	protected abstract void sorting(); //정의 없이 선언만 되어 있는 추상 메서드
//	protected abstract void sorting() {}; //이렇게도 추상 메소드
	
	public void sort(int[] value) {
		this.value=value;
		sorting(); //하위 클래스에서 구현된 메소드 호출
	}
	
	protected int length() { //데이터의 개수
		int n = -1;
		if(value != null) {
			n = value.length;
		}
		return n;
	}
	
	protected final int compare(int i, int j) {
		return value[i]-value[j]; //양수인지 음수인지.
	}
	
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j]=t;
	}
}

class SelectionSort extends SortInt{ //추상 클래스를 상속하면 추상 클래스의 추상 메소드 재정의 하지 않으면 오류

	@Override
	protected void sorting() {
		for(int i=0; i<length()-1;i++) {
			for(int j=i+1; j<length();j++) {
				if(compare(i, j)>0) {
					swap(i, j);
				}
			}
		}
		
	} 
}

class BubbleSort extends SortInt{

	@Override
	protected void sorting() {
		boolean flag = true;
		
		for(int i=1;flag;i++) {
			flag = false;
			for(int j=0;j<length()-i;j++) {
				if(compare(j, j+1)>0) {
					swap(j, j+1);
					flag=true;
				}
			}
		}
	}
	
	
}