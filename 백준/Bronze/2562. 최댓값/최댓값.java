import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt()};
		sc.close();
		
		int max = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = (i + 1);
			}

		}

		System.out.println(max);
		System.out.println(index);
	}

}
