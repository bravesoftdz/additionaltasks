package additionalTasks;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		int n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a natural number to calculate the factorial: ");
			n = sc.nextInt();
			if (n < 0)
				System.out.println("You entered a negative factorial!");
			else {

				long result = 1;

				if (n == 0 || n == 1) {
					System.out.println(n + "! = " + result);
				}

				if (n > 20) {
					System.out.println("We do not count more than 20!");
					System.out.print("Enter a natural number to calculate the factorial: ");
					n = sc.nextInt();
				}

				for (int i = 1; i < n; i++) {
					result = result * i;
					System.out.println(n + "! > " + result);
				}
			}
		} while (n < 0);
		System.out.println("End;");
	}

}
