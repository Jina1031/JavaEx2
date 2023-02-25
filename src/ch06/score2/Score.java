package ch06.score2;
//Score2 
public class Score {
	//입력받은 인원수만큼 학생의 정보를 저장 클래스
	//배열 사용
	private ScoreVO[] list; //ScoreVO 클래스의 list 배열, 메모리 할당 안되어 있는 상태(null 상태)
	private int count; //인원수
	
	public Score() {//생성자
		count =0;
		allocation(5);
	}
	
	//배열의 메모리할당
	private void allocation(int capacity) { //외부 접근 불가능
		ScoreVO[] temp = new ScoreVO[capacity]; //메소드 종료되면 temp 배열을 사라짐
		
		if(list != null && count > 0) {
			System.arraycopy(list, 0, temp, 0, count); //배열 복제
		}
		list=temp; //temp의 주소를 list에 넘김
	}
	
	//배열에 학생 정보 저장
	public int append(ScoreVO vo) {
		if(count >= list.length) {     //배열이 꽉 찬 경우
			allocation(list.length+5); // 배열의 길이를 늘리면서 
			                           // allocation 의 ScoreVO[] temp = new ScoreVO[capacity];로 
			                           // 지속적인 배열 생성 복사 반복
			
		}
		
		list[count++]=vo;//배열에 학생 정보 저장
		//일단 index 0번에 저장하고, 그 뒤에 count ++ 실행.
		/*
		 list[count]=vo;
		 count++;
		 */
		
		return count; //저장된 인원수 반환
	}
	
	public ScoreVO[] getList() { //list는 private라 접근 불가하여 주소를 public 메소드로 전달
		return list;
	}
	
	public int getCount() { //인원수
		return count;
	}
	
	//return타입에는 아무거나 넣어도 상관 없음. 
	//ScoreVO의 주소값을 반환하는 것이기 때문에 ScoreVO를 작성
	public ScoreVO readScore(String hak) { //학번 검색
		ScoreVO vo = null;
		
		for(int i=0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				//String의 equals() : 문자열을 서로 비교해서 같으면 true를 반환
				//문자열은 어떠한 경우라도 ==으로 비교하면 안된다.
				// ==는 문자열을 비교하는 것이 아니라 문자열이 저장된 주소를 비교
				vo=list[i]; //null이 아니면 해당되는 주소를 반환
				break;
			}
		}
		
		return vo;
	}
	
	public double grade(int score) { //과목마다 평점 구하기
		double result=0;
		
		if(score >= 95) result=4.5;
		else if(score >= 90) result=4.0;
		else if(score >= 85) result=3.5;
		else if(score >= 80) result=3.0;
		else if(score >= 75) result=2.5;
		else if(score >= 70) result=2.0;
		else if(score >= 65) result=1.5;
		else if(score >= 60) result=1.0;
		else result=0.0;
		
		return result;
		
	}
	
//오버로딩. 지우는 역할을 하는 것 같은 두 가지 메소드를 이름을 똑같이 줘서 가독성이 높게 함	
	public boolean deleteScore(ScoreVO vo) {
		if(count <= 0 || vo == null) {
			return false;
		}
		
		for(int i=0; i<count;i++) {
			if(list[i] == vo) {
				deleteScore(i);
				return true;
			}
		}
	
		return false;
	}
	
	
	public void deleteScore(int index) { //index에 있는 자료를 삭제. 자료를 삭제하는 index위치가 매개변수
		if(index < 0 || index >= count) {
			return;
		}
		
		for(int i=index; i<count-1;i++) { 
			list[i]=list[i+1];
		}
		count--;
		list[count]=null;
		
	}
	
	
}
