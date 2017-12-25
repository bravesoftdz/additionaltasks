package additionalTasks;

public class task12 {

	public static void main(String[] args) {

		int arr[] = new int[100];

		for (int j = 1; j < 100; j += 2) {
			arr[j] = j;
		}

		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

}
