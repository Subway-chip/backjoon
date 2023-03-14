import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
        int B = sc.nextInt();
        int i;
		for (i = Math.max(A / 2, B); i >= 0; i--) {
			if(A-i*2>=0 && B-i>=0) break; 
		}
		System.out.println(i);
	}
}