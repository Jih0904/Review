package r0612;

public class C03IfElseIf {

	public static void main(String[] args) {
		// If-else If-else statement
		int hour = 23;
		
		if (hour < 12) {
			System.out.println("Good Morning");
		}
		else if (hour < 18) {
			System.out.println("Good Afternoon");
		}
		else if (hour < 21) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
		
		int cTime =20;
		String greeting = "";
		
		if (cTime < 12) {
			greeting = "Good Morning";
		}
		
		else if (cTime < 18) { 
			greeting = "Good Afternoon";
		}
		else if (cTime < 21) {
			greeting = "Good Evening";
		}
		else {
			greeting = "Good Night";
		}
		
		System.out.println(greeting);
		

}
	
}
