package r0612;

public class C01While {

	public static void main(String[] args) {
		// 1���� 10������ ��� �ڿ����� ���� �� ���

		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num; // sum = sum + num; 1 + 2 + 3 +.... 10
			num++;
		}
		
		System.out.println("1���� 10���� �ڿ����� ����" + sum);
		System.out.println(num);
	}

}
