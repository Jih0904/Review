package r0612;

public class C04Grade {

	public static void main(String[] args) {
		// ������ ���� ���� (A,B,C 3����) ���ϱ�
		int score = 100;
		char grade = 0;
		
		if (score >=90) {
			grade = 'A';
		}
		else if (score >=80) {
			grade = 'B';
	}
		else {
			grade = 'c';
		}
		
		System.out.println(grade);
}
}
