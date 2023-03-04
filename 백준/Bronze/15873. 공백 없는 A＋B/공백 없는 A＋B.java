import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int sum = (A / 10) + (A % 10);

		if (A == 1010) {
			sum = 20;
		}
		if (A / 10 > 10) {
			sum = (A / 100) + (A % 100);
		}

		System.out.println(sum);

	}
}
