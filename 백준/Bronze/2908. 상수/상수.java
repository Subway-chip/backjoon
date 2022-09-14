import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		A = A.substring(2, 3) + A.substring(1, 2) + A.substring(0, 1);
		B = B.substring(2, 3) + B.substring(1, 2) + B.substring(0, 1);

		if (Integer.parseInt(A) > Integer.parseInt(B)) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}

	}

}
