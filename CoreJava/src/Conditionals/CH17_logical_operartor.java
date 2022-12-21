package Conditionals;

public class CH17_logical_operartor {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c =  true;
		boolean d =  false;
		boolean e = false;
		
		if (a && b  && c) {
			System.out.println("y");
			
		}
		else {
			System.out.println("N");
		}
		
		if (c || d ) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		
		System.out.println(!e);
		System.out.println(!d);
	}

}
