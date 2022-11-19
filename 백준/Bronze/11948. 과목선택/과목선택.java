import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp,0,4, Comparator.reverseOrder()); // 내림차순
		Arrays.sort(tmp,4,6, Comparator.reverseOrder()); // 내림차순
		
//		for( int i : tmp) {
//			System.out.println("["+i+"]");
//		}
		
		System.out.println(tmp[0]+tmp[1]+tmp[2]+tmp[4]);
			
		}
	}

