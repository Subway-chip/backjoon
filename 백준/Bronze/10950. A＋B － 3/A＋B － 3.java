import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[T];
		
		for(int i=0;i<T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A + B;
		}
		sc.close();
		
		for( int k : arr) {
			System.out.println(k);
		}
		
		 /*
		case 2
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
        
	     */
		
	}

}
