package CodeWithHarry_CH3_Oprator;

public class Ch3_oprator {

	public static void main(String[] args) {

		// Arithmetic Operator
		int a = 4;
		int b = 6 + a;

		int c = 4;
		int d = 6 % c; // modulo operator

		System.out.println("Arithmetic operator = " + b);
		System.out.println("Modula operator =  " + d);

		// Assignment Operator
		int e = 9;
		e += 3;
		System.out.println("Assignment operator = " + e);

		// Comparison operator
		System.out.println("Comparison  operator = " + (64 > 6));
		
		// Logical Operator 
		System.out.println("Logical Oprator a= "+(64>4 && 64>6)+ ","+(64>8));
		System.out.println();

	}

}
