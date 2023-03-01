import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int A_score = 0;
		int B_score = 0;

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {
				String A = sc.next();
				String B = sc.next();

				if (A.equals("R") && B.equals("P")) {// 주먹 , 보자기
					B_score++;
				} else if (A.equals("R") && B.equals("S")) {// 주먹, 가위
					A_score++;
				} else if (A.equals("R") && B.equals("R")) {// 주먹, 주먹

				} else if (A.equals("S") && B.equals("S")) {// 가위, 가위

				} else if (A.equals("S") && B.equals("P")) {// 가위, 보자기
					A_score++;
				} else if (A.equals("S") && B.equals("R")) {// 가위, 주먹
					B_score++;
				} else if (A.equals("P") && B.equals("P")) {// 보자기, 보자기

				} else if (A.equals("P") && B.equals("S")) {// 보자기, 가위
					B_score++;
				} else if (A.equals("P") && B.equals("R")) {// 보자기, 주먹
					A_score++;
				}
			}
			if (A_score > B_score) {
				System.out.println("Player 1");
			} else if (A_score < B_score) {
				System.out.println("Player 2");
			} else if (A_score == B_score) {
				System.out.println("TIE");
			}
			A_score = 0;
			B_score = 0;

		}

	}
}
