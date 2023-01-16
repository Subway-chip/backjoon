import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = 0;

		if (A / N >= 1) {
			sum += N;
		} else {
			sum += A;
		}
		if (B / N >= 1) {
			sum += N;
		} else {
			sum += B;
		}
		if (C / N >= 1) {
			sum += N;
		} else {
			sum += C;
		}
		
		System.out.println(sum);

	}
}
