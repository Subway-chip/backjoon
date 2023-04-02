import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];

		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[1] < arr[4]) {
			System.out.println(Math.abs(arr[0] - arr[3]));
		} else if (arr[1] == arr[4] && arr[2] <= arr[5]) {
			System.out.println(Math.abs(arr[0] - arr[3]));
		}

		else {
			System.out.println(Math.abs(arr[0] - arr[3]) - 1);
		}

		System.out.println(Math.abs(arr[0] - arr[3]) + 1);
		System.out.println(Math.abs(arr[0] - arr[3]));

	}
}
