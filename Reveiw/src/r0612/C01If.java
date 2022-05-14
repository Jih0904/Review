package r0612;

public class C01If {

	public static void main(String[] args) {
		//If Statement
		
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("첫방문");
			visitCnt++;
		}
		
		if(visitCnt >= 1) {
			System.out.println("방문");
		}
	}

}
