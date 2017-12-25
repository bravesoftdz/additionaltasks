package additionalTasks;

public class task8 {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 30;
		int d = 9;

		int x[] = { a, b, c, d };

		int max = x[0];
		for (int i = 0; i != x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("Even element: " + max);

	}

}
