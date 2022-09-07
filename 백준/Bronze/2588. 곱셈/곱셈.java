import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(2)));
		System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(1,2)));
		System.out.println(Integer.parseInt(A) * Integer.parseInt(B.substring(0,1)));
		System.out.println(Integer.parseInt(A) * Integer.parseInt(B));
		
		}

	}

