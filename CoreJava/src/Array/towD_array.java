package Array;

import java.util.Scanner;

public class towD_array {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			int[][] numbers = new int[rows][cols];

			// intput................
			for(int i=0; i<rows;i++){
				// colums
				for(int j=0;j<cols;j++){
					numbers[i][j] = sc.nextInt();
				}
			}
			// output................
			for (int i=0;i<rows;i++){
				for (int j=0;j<cols;j++) {
					System.out.print(numbers[i][j]+"");
				} 
				System.out.println();
			}
		}
	}
}
