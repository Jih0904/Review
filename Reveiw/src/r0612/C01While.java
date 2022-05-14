package r0612;

public class C01While {

	public static void main(String[] args) {
		// 1부터 10까지의 모든 자연수를 더한 값 출력

		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num; // sum = sum + num; 1 + 2 + 3 +.... 10
			num++;
		}
		
		System.out.println("1부터 10까지 자연수의 총합" + sum);
		System.out.println(num);
	}

}
