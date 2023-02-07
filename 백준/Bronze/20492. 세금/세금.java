import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double a = (N - (N * 0.22));

		double b = (N - (N * 0.2 * 0.22));

		System.out.print((int) a+" ");
		System.out.println((int) b);

	}

}
