import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int player = sc.nextInt();

			if (T == player) {
				sum++;

			}

		}
		System.out.println(sum);

	}

}
