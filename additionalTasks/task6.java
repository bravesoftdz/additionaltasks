package additionalTasks;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		// Create variables
		String number = "";
		int index = 0;
		int result = 0;
		int value;

		// Create canner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		number = sc.nextLine();

		// Find even numeral
		while (index != number.length()) {
			value = Integer.parseInt(String.valueOf(number.charAt(index)));
			if (value % 2 == 0)
				result += value;
			index = index + 1;
		}
		System.out.println(result);

	}

}
