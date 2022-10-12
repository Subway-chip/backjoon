import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String JaeHwan = sc.next();
		String Doctor = sc.next();
		
		if(JaeHwan.length() >= Doctor.length()) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}

	}
}