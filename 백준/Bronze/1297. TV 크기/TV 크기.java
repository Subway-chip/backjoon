import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();

		double val = Math.sqrt(1.0 * D * D / (H * H + W * W));

		System.out.print((int) Math.floor(H * val) + " " + (int) Math.floor(W * val));

	}
}
