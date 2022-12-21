package CodeWithHarry_CH3_Oprator;

public class precedence_Associativity {

	public static void main(String[] args) {
		
		// precedence 
		// Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
		int a = 6*3-6/3;
		
		/*
		 * = 6*3 - 6/3 
		 * = 18 - 2
		 * = 16
		 */
		
		System.out.println(a);

		//Associativity 
		
		int b = 6/3  - 6*3;
		
		/*
		 * = 6/3  -  6*3
		 * = 2-18
		 * = -16
		 */
		System.out.println(b);
		
		
		
	}

}
