import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			String str = sc.next();

			if (str.substring(str.length() / 2 - 1, str.length() / 2)
					.equals(str.substring((str.length() / 2), (str.length() / 2) + 1))) {
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}

		}

	}
}
