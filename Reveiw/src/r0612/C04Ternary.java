package r0612;

import java.util.Scanner;

public class C04Ternary {

	public static void main(String[] args) {
		//���� ������ : ����(boolean(true,flase) ? true�ΰ�� : false�ΰ��)
        //System.out.println(result) ? "T" : "F" ;
		
		int score = 50;
		String result = "";
		
		result = (score >= 60) ? "�հ�" : "����";
		System.out.println(result);
		System.out.println(score + "����" + result + "�Դϴ�");
		
		
	}
	

}
