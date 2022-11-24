import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			int F = sc.nextInt();
			int M = sc.nextInt();
			
			if(F == 0 && M == 0) {
				break;
			}
			
			System.out.println(F+M);
			
		}

	}
}
