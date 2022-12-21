package loops;

public class Ch5_breack_continue {

	public static void main(String[] args) {
		
		// break Statment 
		System.out.println("Its Break Stetment ");
		System.out.println("  ");
		int a = 1;
		for (a = 1; a < 10; a++) {
			System.out.println(a);

			if (a >= 6) {
				System.out.println("please breck ");
				System.out.println("  ");
				break;

			}
			
		}
         /// continue Statment 
		System.out.println("Its Continue Stetment ");
		System.out.println("  ");
		int b = 11;
		for (b = 11; b < 20; b++) {
			if (b == 13) {
				System.out.println("Ending The loop");
				continue;
			}
			System.out.println(b);

		}

	}
}
