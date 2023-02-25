package ch06.score2;

import java.util.Scanner;
//메뉴 출력, 학생 정보 입출력 클래스
public class ScoreUI {
	private Scanner sc = new Scanner(System.in); // 자동 close됨
	private Score ss = new Score();
	
	public void menu() {
		int ch;
		
		while(true) { //무한루프
			do {
				System.out.print(" 1.등록 2.학번검색 3.전체 리스트 4.평점출력 5.수정 6.삭제 7.출력  =>");
				ch=sc.nextInt();
			}while (ch<1||ch>7); //메뉴는 1~7
			
			if(ch == 7) {
				return; //7번이면 
				//break문 써도 상관 없음.
			}
			
			//메뉴같은 건 if보다 switch가 더 가독성이 좋음
			switch(ch) { //버튼마다 메소드 호출
			case 1 : input(); break;
			case 2 : findByHak(); break;
			case 3 : listAll(); break;
			case 4 : gradeAll(); break;
			case 5 : update(); break;
			case 6 : delete(); break;
			}
		}
	}
	
	public void input() {
		System.out.println("\n데이터 등록");
		
		ScoreVO vo= new ScoreVO(); //ScoreVO 객체는 한 학생의 정보. 한 학생의 정보를 담을 객체 생성 
		                           //setter를 통해 정보 설정.
		                           //input메소드가 호출 될 때마다 객체가 생성되어서 input메소드 호출한 만큼 객체 생성
		
		System.out.print("학번 ? ");
		vo.setHak(sc.next());
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		//이 메소드가 끝나면 안에 있는 지역 변수는 사라짐. 
		//vo객체는 지역 변수이기 때문에 사라짐 

		int cnt=ss.append(vo);
		//그렇기 때문에 append 호출하여 list 배열에 주소를 저장
		//list는 배열이기 때문에 주소값을 가지고 있고 
		//append 메소드는 list 배열에 저장되고 list 배열은 프로그램이 종료되는 시점에 사라짐
		
		
		System.out.println("학생 정보가 등록되었습니다(총인원수 : "+cnt+ ")");
	}
	
	
	public void findByHak() {
		System.out.println("\n학번 검색");
		
		String hak;
		System.out.print("검색할 학번? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo==null) {
			System.out.print("존재하지 않는 학번입니다.\n");
			return;
		}
		
		System.out.print(vo.getHak()+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getKor()+"\t");
		System.out.print(vo.getEng()+"\t");
		System.out.print(vo.getMat());
		System.out.println();
	}
	
	public void listAll() {
		System.out.println("\n전체 리스트");
		
		ScoreVO[] list = ss.getList(); //Score 클래스에서 받은 list 읽어오기
		                               //호출한 메서드의 반환값과 담는 자료타입이 같아야 함
		                               //배열을 부르는 메소드이기 때문에 담는 자료형도 배열
		int tot, avg;
		for(int idx=0;idx<ss.getCount();idx++) {
			ScoreVO vo = list[idx];
			
			tot = vo.getKor()+vo.getEng()+vo.getMat();
			avg= tot/3;
			
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(tot+"\t");
			System.out.println(avg);
		}
		System.out.println();
	}

	public void gradeAll() {
		System.out.println("\n평점 리스트");
		
		ScoreVO[] list = ss.getList();
		for(int idx=0; idx<ss.getCount();idx++) {
			System.out.print(list[idx].getHak()+"\t");
			System.out.print(list[idx].getName()+"\t");
			
			System.out.print(ss.grade(list[idx].getKor())+"\t");
			System.out.print(ss.grade(list[idx].getEng())+"\t");
			System.out.println(ss.grade(list[idx].getMat())+"\t");
		}
		System.out.println();
	}
	
	public void update() {
		System.out.println("\n데이터 수정");
		
		String hak;
		System.out.print("수정할 학번? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak); //ScoreVO vo에 주소 저장.
		                                //readScore의 반환값이 ScoreVO 라서 맞춰준 것
		if(vo==null) {
			System.out.print("존재하지 않는 학번입니다.\n");
			return;
		}
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정이 완료되었습니다.\n");
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제");
		//배열의 같은 경우 index[i]에 index[i+1]의 값을 넣어주고 맨 마지막을 null로 초기화 
		
		String hak;
		System.out.print("삭제할 학번? ");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo==null) {
			System.out.print("존재하지 않는 학번입니다.\n");
			return;
		}
		
		ss.deleteScore(vo);
		System.out.println("데이터를 삭제했습니다.\n");
	}
	
}
