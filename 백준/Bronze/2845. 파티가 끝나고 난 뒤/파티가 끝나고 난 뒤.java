import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int P = sc.nextInt();
		
		for(int i = 0 ; i < 5 ; i++) {
			int member = sc.nextInt();
			System.out.print(member - (L*P) +" ");
		}
		
		}
	}

