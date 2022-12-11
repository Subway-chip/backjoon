import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] coord1 = { sc.nextInt(), sc.nextInt() };
		int[] coord2 = { sc.nextInt(), sc.nextInt() };
		int[] coord3 = { sc.nextInt(), sc.nextInt() };
		int[] coord4 = new int[2];

		for (int i = 0; i < 2; i++) {

			if (coord1[i] == coord2[i]) {
				coord4[i] = coord3[i];
			} else if (coord1[i] == coord3[i]) {
				coord4[i] = coord2[i];
			} else {
				coord4[i] = coord1[i];
			}

		}

		System.out.println(coord4[0] + " " + coord4[1]);

	}
}
