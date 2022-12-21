import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int get_off = 0;
		int get_on = 0;
		int now[] = new int[4];

		for (int i = 0; i < 4; i++) {
			get_off += sc.nextInt();
			get_on += sc.nextInt();

			now[i] = get_on - get_off;
		}

		Arrays.sort(now);

		System.out.println(now[3]);

	}

}
