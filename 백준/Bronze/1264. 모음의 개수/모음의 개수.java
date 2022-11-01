import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
			while(true) {
				String str = sc.nextLine();
				
				if(str.equals("#")) {
					break;
				}
			
			for(int j = 0 ; j < str.length() ; j++) {
				String str_piece = str.charAt(j)+"";
				if(str_piece.equalsIgnoreCase("a")||
					str_piece.equalsIgnoreCase("e")||
					str_piece.equalsIgnoreCase("i")||
					str_piece.equalsIgnoreCase("o")||
					str_piece.equalsIgnoreCase("u")) {
					count++;
				}
				
				}
			System.out.println(count);
			count = 0;
			
			}
	}
}