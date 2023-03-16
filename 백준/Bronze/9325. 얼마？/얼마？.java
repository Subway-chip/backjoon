import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int sum = 0;
			int s = sc.nextInt();
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {
				int q = sc.nextInt();
				int p = sc.nextInt();
				sum += q * p;
			}
			System.out.println(s + sum);
		}
	}
}
