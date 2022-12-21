package Conditionals;

import java.util.Scanner;

public class CH18_switch_case {

	public static void main(String[] args) {
		int age;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age");
			age = sc.nextInt();
		}
		switch (age) {
		case 18: {
			System.out.println("ok but you are not eligible for the job");
			break;
		}
		case 23: {
			System.out.println("You are eligible for the job");
			break;
		}
		case 60: {
			System.out.println("You are Retired ");
			
		}
		default: {
			System.out.println("Enjoy your life");
		}
		}

	}
}
