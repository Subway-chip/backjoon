import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;

		for (int i = 0; i < 8; i++) {
			String a = sc.next();

			if (i == 0 || i == 2 || i == 4 || i == 6)
				for (int j = 0; j < 8; j++) {
					if (j == 0 || j == 2 || j == 4 || j == 6) {
						String b = a.charAt(j) + "";
						if (b.equals("F")) {
							count++;
						}
					}
				}

			if (i == 1 || i == 3 || i == 5 || i == 7)
				for (int j = 0; j < 8; j++) {
					if (j == 1 || j == 3 || j == 5 || j == 7) {
						String b = a.charAt(j) + "";
						if (b.equals("F")) {
							count++;
						}
					}
				}

		}
		System.out.println(count);

	}
}
