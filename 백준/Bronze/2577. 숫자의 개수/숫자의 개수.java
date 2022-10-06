import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String result = A * B * C + "";

		for (int j = 0; j < 10; j++) {
			int count = 0;
			for (int i = 0; i < result.length(); i++) {
				String a = result.charAt(i) + "";
				if (a.equals(j + "")) {
					count++;
				}
			}
			System.out.println(count);

		}
	}
}
