package methods;
public class ch34_recursion_factori {
	static long fact(long n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
	public static void main(String[] args) {
		long a = 5;
		System.out.println("OUT PUT ");
		System.out.println("Your Factorial Number Is: "+fact(a));
	}
}

