import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M[] = { 1, 0, 0 };

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if (M[x] == 1) {
				M[y] = 1;
				M[x] = 0;
			} else if (M[y] == 1) {
				M[x] = 1;
				M[y] = 0;
			}

		}
		for (int i = 0; i < M.length; i++) {
			if (M[i] == 1) {
				System.out.println(i + 1);
			}
		}

	}
}
