
package demoOnlyPrectice;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {

		int a;
		int b;

		Scanner sr = new Scanner(System.in);
		System.out.print("Please Enter Your Int(A) Number = ");
		a = sr.nextInt();
		System.out.print("Please Enter Your Int(B) Number = ");
		b = sr.nextInt();

		for (int i = 0; i < a; i++) {

			System.out.print(i + " ");

		}

		if (a > b) {
			System.out.println(" Ture ");

		} else {
			System.out.println(" Flase");
		}

		String i;
		String j;
		String k;
		String l;
		String m;
		int n;
		String name = "Honey";
		String namee = "Purohit";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full name = ");
		i = sc.nextLine();

		System.out.println("Enter Your LOWER Case to UPPER Case =  ");
		j = sc.nextLine();

		System.out.println("Enter Your UPR Case Name to LOWER Case = ");
		k = sc.nextLine();

		System.out.println("Ends with = ");
		l = sc.nextLine();

		System.out.println("Start with = ");
		m = sc.nextLine();

		System.out.println("please enter your value = ");
		n = sc.nextInt();

		System.out.println(i);
		System.out.println("Total I . lenght Is " + i.length());
		System.out.println("Please find the LOWER TO UPR = " + j.toUpperCase());
		System.out.println("please Find the UPR TO LOWER  = " + k.toLowerCase());
		System.out.println("End with = " + i.endsWith(l));
		System.out.println("Start with = " + i.startsWith(m));
		System.out.println(name + " \"Raj\" " + namee);
		System.out.println(i.charAt(n));

		// switch statment

		int age;

	try(Scanner ar = new Scanner(System.in)) {
		System.out.println("Enter Your Age = ");
		age = ar.nextInt();
	}
		switch (age) {

		case 20:
			System.out.println("You are a mechured Good and Welcome");
			break;
		case 30:
			System.out.println("You are a Expirence person  Good and Welcome");
			break;
		case 40:
			System.out.println("You are a Expirence person Good and Welcome(your greade is better then 30 age )");
			break;

		case 60:
			System.out.println(
					"you are oldest person Good and Welcome(but you are reture before 65 year old )work only 5 year");
			break;
		default: {
			System.out.println("You are not in my list so good by and try " + "after complete your age according"
					+ " to my rules (12,20,30 and 40 and 60 )");
		}

			int day;
			Scanner dy = new Scanner(System.in);
			System.out.print("Enter Your Degit I'll Provide You Your Day =: ");
			day = dy.nextInt();

			switch (day) {
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;

			default:
				System.out.println(" Wroung");

			}

		}
	}
}
