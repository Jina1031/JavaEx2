package ch07.unit4;

public class Ex15_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		//buffer와 builder에 똑같이 만개의 수를 집어넣음. 
		new Thread(()->{
			for(int i=0;i<10000;i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<10000;i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(()->{
			try {
				Thread.sleep(5000);
				
				System.out.println("StringBuffer length: "+ buffer.length()); //StringBuffer length: 77780
				System.out.println("StringBuilder length: "+ builder.length()); //StringBuilder length: 76491
				//StringBilder : 계속 시간이 바뀜. 안전하지 않다는 것.
				
			} catch (Exception e) {
			}
		}).start();
		
	}

}
