import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = i; j < 2 * N - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < 2*i-2; j++) {
				System.out.print(" ");
			}
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
