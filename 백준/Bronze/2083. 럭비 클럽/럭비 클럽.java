import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String name = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();
			
			if(age > 17 || weight >= 80) {
				System.out.println(name + " " + "Senior");
				
			}else if(name.equals("#") && age == 0 && weight == 0){
				break;
				
			}else {
				System.out.println(name + " " + "Junior");
				
			}
		}
		
		}
	}

