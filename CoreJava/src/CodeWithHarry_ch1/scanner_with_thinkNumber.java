package CodeWithHarry_ch1;

import java.util.Scanner;

public class scanner_with_thinkNumber {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter Number 1 = ");
		int a = sc.nextInt();
		System.out.println("Enter Number 2 = ");
		int b = sc.nextInt();
		int sum = a+b; 
		System.out.println("Total Numner Is =" + sum);
		
		boolean b1 = sc.hasNextInt();
		System.out.println(b1);
		String str = sc.nextLine();
		System.out.println(str);
	}
    
    
    
	}

}
