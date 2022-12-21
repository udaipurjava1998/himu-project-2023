package CodeWithHarry_ch1;

// COde For The 4 subject marks and Percentage

import java.util.Scanner;

class subject {

	float mark;
}

public class Five_subject_mark {
	public static void main(String[] args) {

		subject s1 = new subject();
		System.out.println("Enter Maths Markes = ");
		try (Scanner scr = new Scanner(System.in)) {
			s1.mark = scr.nextFloat();

			subject s2 = new subject();
			System.out.println("Enter Hindi Marks = ");
			s2.mark = scr.nextFloat();

			subject s3 = new subject();
			System.out.println("Enter Your English Marks = ");
			s3.mark = scr.nextFloat();

			subject s4 = new subject();
			System.out.println("Enter your Socical Sceince Maerks ");
			s4.mark = scr.nextFloat();

			float mark = (s1.mark + s2.mark + s3.mark + s4.mark);
			float per = (mark * 100 / 400);
			System.out.println("Your Per=" + per);
		}
	}

}
