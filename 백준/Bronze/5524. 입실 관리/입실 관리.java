import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			
			String Si = sc.next();
			
			Si = Si.toLowerCase();
			
			System.out.println(Si);
			
		}

	}

}
