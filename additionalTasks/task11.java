package additionalTasks;

public class task11 {

	public static void main(String[] args) {

		int arr[] = new int[20];

		for (int j = 2; j < 20; j += 2) {
			arr[j] = j;
		}

		for (int i = 2; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}

	}

}
