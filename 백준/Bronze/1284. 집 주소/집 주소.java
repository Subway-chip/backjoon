import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String num = sc.next();
			int sum = 0;

			if (num.equals("0")) {
				break;
			}

			for (int i = 0; i < num.length(); i++) {
				String numchar = num.charAt(i)+"";
				if (numchar.equals("1")) {
					sum += 2;
				} else if (numchar.equals("0")) {
					sum += 4;
				} else {
					sum += 3;
				}
			}
			sum += num.length() + 1;
			System.out.println(sum);
		}
	}

}