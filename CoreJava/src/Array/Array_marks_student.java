package Array;

public class Array_marks_student {

	public static void main(String[] args) {
		/*
		 * class of 500 students i have store the mark these 500 students I have 2
		 * option option 1 = create 500 variables option 2 = use array
		 */

		// There are three ways to create array in java

		// first
		/*
		 * int [] marks; marks = new int [5];
		 */

		// second //

		int[] marks = new int[5];

		marks[0] = 100;
		marks[1] = 70;
		marks[2] = 80;

		marks[3] = 65;
		marks[4] = 98;

		for (int i : marks) {
			System.out.println(i);
		}
		/*
		 * // Third int[] marks = { 100, 70, 80, 65, 98, };
		 * 
		 * System.out.println(marks[1]);
		 */
	}

}
