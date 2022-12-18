import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int number[] = new int[7];
		int min = 100;

		for (int i = 0; i < 7; i++) {
			number[i] = sc.nextInt();

			if (number[i] % 2 == 1) {
				min = Math.min(min, number[i]);
				sum += number[i];
			}
		}

		if (sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}