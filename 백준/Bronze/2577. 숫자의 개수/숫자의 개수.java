import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String result = A * B * C + "";

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < result.length(); j++) {
				String a = result.charAt(j) + "";
				if (a.equals(i + "")) {
					count++;
				}
			}
			System.out.println(count);

		}
	}
}
