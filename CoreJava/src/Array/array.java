package Array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {

		int c[] = { 3, 2, 4, 5, 6, };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println(" ");

		int a[] = new int[5];
		a[0] = 33;
		a[1] = 34;
		a[2] = 35;
		a[3] = 36;
		a[4] = 37;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		 
		System.out.println(" ");

		try (Scanner sr = new Scanner(System.in)) {
			System.out.println("please enter your marks =  ");
			int b = sr.nextInt();

			int per = (b * 100 / 200);
			System.out.print("pls find your percentege =  ");
			System.out.print(per + "%");
		}

	}

}
