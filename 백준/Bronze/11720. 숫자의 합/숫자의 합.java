import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		StringBuffer sb = new StringBuffer();
		String a = sc.next();
		sb = sb.append(a);
		
		for(int i=0;i<N;i++) {
			sum += Integer.parseInt(sb.charAt(i)+"");
		}
		System.out.println(sum);

	}

}
