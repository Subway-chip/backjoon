import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();
			
		StringTokenizer st = new StringTokenizer(N," ");
		System.out.println(st.countTokens());

	}
}