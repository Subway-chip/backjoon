import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        int A;
    	int B;

    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNextInt()){
    		
    	A = sc.nextInt();
    	B = sc.nextInt();
    	
    	System.out.println(A + B);
    	}
    	sc.close();
	}

}
