package methods;

public class ch33_varargs {

	static int sum(int... arr) {
		int result = 0;

		for (int a : arr) {
			result += a;
		}
		return result;
	}

	public static void main(String[] args) {
		int result = 0;
		System.out.println("Sum of value A or B:  " + sum(5, 5));
		System.out.println("Sum of value A or B:  " + sum(6, 7, 2));

		System.out.println("Sum of value A or B:  " + sum(5, 6, 7, 8));

	}

}
