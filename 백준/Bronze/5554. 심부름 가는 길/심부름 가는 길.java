import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sec = 0;
		int x,y;
		
		for(int i = 0 ; i < 4 ; i++) {
			sec += sc.nextInt();
			
		}
		
		x = sec/60;
		y = sec%60;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
