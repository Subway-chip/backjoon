import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int S = sc.nextInt();

		if (S == 1 && T <= 11) {
			System.out.println(280);
		} else if (S == 1 && T >= 12) {
			System.out.println(280);
		} else if (S == 0 && 12 <= T && T <= 16) {
			System.out.println(320);
		} else {
			System.out.println(280);
		}

	}

}
