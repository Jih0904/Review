package r0612;

public class C02Logicla {

	public static void main(String[] args) {
	
		// 논리 연산자 AND OR 
		int num1 = 10;
		int num2 = 5;
		
		// AND && 
		System.out.println(num1 == num1 && num2 == num2); // T && T T
		System.out.println(num1 != num1 && num2 == num2); // F && T F
		System.out.println(num1 == num1 && num2 != num2); // T && F F
		System.out.println(num1 != num1 && num2 != num2); // F && F F
		
		//OR || 
		System.out.println(num1 == num1 || num2 == num2); // T || T T
		System.out.println(num1 != num1 || num2 == num2); // F || T T
		System.out.println(num1 == num1 || num2 != num2); // T || F T
		System.out.println(num1 != num1 || num2 != num2); // F || F F

	}

}
