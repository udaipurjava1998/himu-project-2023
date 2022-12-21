package methods;

import java.util.Scanner;

public class aading {

	static float logic(float x, float y) {
		float z;
		if (x > y) {
			z = x + y;
		}

		else {
			z = (x * y) + (x - y) + (y / 3);
			// 7*8= 56 + 7 = 63 - y(8) = 55

		}
		return z;
	}

	public static void main(String[] args) {

		float a = 7;
		float b = 8;
		float c = logic(a, b);

		System.out.println(c);

		int day;
		System.out.println("Enter Your Number = ");
		Scanner sr = new Scanner(System.in);
		day = sr.nextInt();

		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("tuseday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		case 4: {
			System.out.println("trusday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("saturday");
			break;
		}
		case 7: {
			System.out.println("sunday");
			break;
		}
		
		default:
			System.out.println("out not intested your value ");
		}
	}
}
