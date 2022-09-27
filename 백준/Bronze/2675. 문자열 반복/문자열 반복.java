import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			StringBuilder sb = new StringBuilder();
			int R = sc.nextInt();
			String P = sc.next();

			for (int j = 0; j < P.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb = sb.append(P.charAt(j));
				}
			}
			System.out.println(sb);

		}
	}

}
