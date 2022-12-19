import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int day = 0;
		
		while(true) {
			A -= C;
			B -=D ;
			day++;
			
			if(A <= 0 && B <= 0) {
				break;
			}
		}
		
		System.out.println(L - day);
	}

}