import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sang = sc.nextInt();
		int jung = sc.nextInt();
		int haduck = sc.nextInt();
		int cola = sc.nextInt();
		int cider = sc.nextInt();
		
		int burger = Math.min(Math.min(sang, jung),haduck);
		int beverage = Math.min(cola, cider);
		
		System.out.println((burger + beverage) - 50);

	}
}
