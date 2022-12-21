package Array;

public class CH28_multidimentional_array {

	public static void main(String[] args) {
		// Multi dimentional Array
		//int[] marks; // 1-D Array
		// int [][] flats ; // 2-D Array

		int[][] flats = new int[3][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		flats[2][0] = 301;
		flats[2][1] = 302;
		flats[2][2] = 303;

		System.out.println("multi dimentional arry");
		for (int i = 0; i < flats.length; i++) {
			for (int j = 0; j < flats.length; j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		// TOTRAL LENGTH CHECK FOR THIS ARRAYS
		for (int k=0;k<flats.length;k++) {
			System.out.println(" LENGTH IS = "+ k);
		}
	}
}
