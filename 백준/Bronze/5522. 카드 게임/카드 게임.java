import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = 5;
		int A = 0;

		for (int i = 0; i < T; i++) {

			A += sc.nextInt();
			
		}
		
		System.out.println(A);

	}
}