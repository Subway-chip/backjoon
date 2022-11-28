import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] number = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(number);
		for(int i = 0 ; i < number.length ; i ++) {
			System.out.print(number[i] + " ");
			
		}
		

	}
}
