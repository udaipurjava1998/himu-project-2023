package Array;

import java.util.Scanner;

public class CH27_FOR_EACH_LOOP {

	public static void main(String[] args) {
		int[] marks = new int[10];
		try (Scanner sr = new Scanner(System.in)) {
		}
	    
		marks[0] = 78;
		marks[1] = 97;
		marks[2] = 45;
		marks[3] = 61;
		marks[4] = 83;
		marks[5] = 91;
		marks[6] = 69;
		marks[7] = 53;
		marks[8] = 47;
		marks[9] = 88;

		for (int meaks : marks) {
			System.out.println(meaks);
		}

		// percent of total student
		int totalmarks = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6] + marks[7]
				+ marks[8] + marks[9]);
		int per = (totalmarks * 100 / 1000);
		System.out.println("total percent is =  " + per);

		for (int i = 0; i < marks.length; i++) {
			System.out.println("length of array = " + i);
			

		}
		

	}
}
