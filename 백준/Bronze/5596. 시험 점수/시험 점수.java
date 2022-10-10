import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int S = 0;
		int T = 0;

		for (int i = 0; i < 4; i++) {
			int Sscore = sc.nextInt();
			S += Sscore;
		}

		for (int i = 0; i < 4; i++) {
			int Tscore = sc.nextInt();
			T += Tscore;
		}
		
		if(S > T) {
			System.out.println(S);
		}else if(S < T) {
			System.out.println(T);
		}else {
			System.out.println(S);
		}
	}
}