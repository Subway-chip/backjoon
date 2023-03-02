import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if ('A' == str.charAt(i)) {
				System.out.print(arr[0] + " ");
			} else if ('B' == str.charAt(i)) {
				System.out.print(arr[1] + " ");
			} else if ('C' == str.charAt(i)) {
				System.out.print(arr[2] + " ");

			}
		}

	}
}
