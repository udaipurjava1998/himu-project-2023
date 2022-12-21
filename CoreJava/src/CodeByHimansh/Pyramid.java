package CodeByHimansh;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int a;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter your number = ");
		a = sr.nextInt();
		if (a <= 10) {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else {
			System.out.println("Sorry Does Not Supported ");

		}
	}
}