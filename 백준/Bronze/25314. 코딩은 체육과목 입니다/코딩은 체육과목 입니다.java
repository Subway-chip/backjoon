import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		N = N/4;
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0 ; i < N; i++) {
			sb.append("long ");
		}
		sb.append("int");
		
		System.out.println(sb);

	}
}