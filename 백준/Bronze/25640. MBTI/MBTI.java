import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String Jinho = sc.next();
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0 ; i < N ; i++) {
			String friend = sc.next();
			
			if(Jinho.equals(friend))count++;
			
		}
		
		System.out.println(count);
	}
}
