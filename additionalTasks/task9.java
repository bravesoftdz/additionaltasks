package additionalTasks;

public class task9 {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 30;
		int d = 9;
		int e = 56;

		int x[] = { a, b, c, d, e };

		int max = x[0];
		int min = x[0];
		for (int i = 0; i != x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		}

		System.out.println("Odd element: " + min);
		System.out.println("Even element: " + max);

	}

}
