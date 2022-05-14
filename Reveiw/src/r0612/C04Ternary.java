package r0612;

import java.util.Scanner;

public class C04Ternary {

	public static void main(String[] args) {
		//삼항 연산자 : 조건(boolean(true,flase) ? true인경우 : false인경우)
        //System.out.println(result) ? "T" : "F" ;
		
		int score = 50;
		String result = "";
		
		result = (score >= 60) ? "합격" : "과락";
		System.out.println(result);
		System.out.println(score + "점은" + result + "입니다");
		
		
	}
	

}
