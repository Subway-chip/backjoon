import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		int val3 = sc.nextInt();

		if (val1 == 60 && val2 == 60 && val3 == 60) {
			System.out.println("Equilateral");
		} else if (val1 + val2 + val3 == 180 && ((val1 == val2) || (val2 == val3) || (val1 == val3))) {
			System.out.println("Isosceles");
		} else if (val1 + val2 + val3 == 180 && ((val1 != val2) || (val2 != val3) || (val1 != val3))) {
			System.out.println("Scalene");
		} else {
			System.out.println("Error");
		}

	}
}
