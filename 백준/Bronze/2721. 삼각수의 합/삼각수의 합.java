import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();

			for (int j = 1; j <= n; j++) {

				sum += j * (j + 1) * (j + 2) / 2;

			}
			System.out.println(sum);
			sum = 0;

		}

	}
}
