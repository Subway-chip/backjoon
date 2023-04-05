import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int Y_fee = 0;
		int M_fee = 0;

		for (int i = 0; i < T; i++) {

			int time = sc.nextInt();

			Y_fee += ((time / 30) + 1) * 10;
			M_fee += ((time / 60) + 1) * 15;

		}

		if (Y_fee == M_fee) {
			System.out.println("Y M " + Y_fee);
		} else if (Y_fee < M_fee) {
			System.out.println("Y " + Y_fee);
		} else if (Y_fee > M_fee) {
			System.out.println("M " + M_fee);
		}

	}
}
