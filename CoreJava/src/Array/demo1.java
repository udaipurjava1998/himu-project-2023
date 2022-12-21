package Array;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {

		int a;
		try (Scanner sr = new Scanner(System.in)) {
			a = sr.nextInt();
		}
		if (a < 30) {
			System.out.println("fail");
		} else if (a < 60)
			System.out.println("second");
		else if (a < 101)
			System.out.println("first");
		else {
			System.out.println("Nothing");
		}

	}
}
