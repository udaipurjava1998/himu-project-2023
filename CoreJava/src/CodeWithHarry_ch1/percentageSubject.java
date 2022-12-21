package CodeWithHarry_ch1;

import java.util.Scanner;

public class percentageSubject {


	public static void main(String[] args) {

		// Question number 1

		int a = 3;
		int b = 5;
		int sum = a + b;
		System.out.println("TOTAL NUMBER A PLUS B = " + sum);
		System.out.println();

		// Question number 2

		float subject1 = 45;
		float subject2 = 95;
		float subject3 = 48;
		float cgpa = (subject1 + subject2 + subject3) / 30;
		System.out.println("Your All Subject CGPA Is = " + cgpa);

		// Question number 3

		System.out.println("Hello Whats Your Name = ");
		try (Scanner sr = new Scanner(System.in)) {
			String name = sr.next();
			System.out.println("Hello " + name + " Have A good dAY");
		}
		// Question number 4
		System.out.println("Enter Your number = ");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(sc.hasNextInt());
		}
		// Question 5
		System.out.println("Enter Your Km = ");
		try (Scanner scr1 = new Scanner(System.in)) {
			float km = scr1.nextFloat();
			float miles = (float) (0.6213711922 * km);
			System.out.println("ToTal Miles In Km = " + miles);
		}

	}
}