import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int az = sc.nextInt();
		
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cz = sc.nextInt();
		
		int bx, by, bz;
				
		bx = Math.abs(az-cx);
		by = cy/ay;
		bz = Math.abs(ax-cz);
		
		System.out.println(bx);
		System.out.println(by);
		System.out.println(bz);
		
		
		
		
	}

}
