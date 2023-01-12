import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int plug = 0;

		for (int i = 0; i < N; i++) {
			plug += sc.nextInt();
		}
		
		System.out.println(plug-(N-1));
	}
}
