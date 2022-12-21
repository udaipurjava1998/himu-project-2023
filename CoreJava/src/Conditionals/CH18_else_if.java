package Conditionals;

import java.util.Scanner;

public class CH18_else_if {

	public static void main(String[] args) {
		int age;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your Age = ");
			age = sc.nextInt();
		}
		if (age>56) {
			System.out.println("Yor Are a Expireance");
		}
		else if(age>46) {
			System.out.println("Yor Are a Semi-Expireance");
			
		}
		else if (age>36) {
			System.out.println("Yor Are a Semi - Semi -Expireance");
		}
		else{
			System.out.println("You Are Not Expireance");
		}

	}

}
