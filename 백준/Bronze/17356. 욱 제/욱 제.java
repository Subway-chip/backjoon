import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		double win = 1 / (1 + Math.pow(10, (B - A) / 400.0));

		System.out.println(win);

	}
}
