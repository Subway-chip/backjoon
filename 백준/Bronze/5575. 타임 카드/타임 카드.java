import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int st_h = Integer.parseInt(st.nextToken());
			int st_m = Integer.parseInt(st.nextToken());
			int st_s = Integer.parseInt(st.nextToken());
			int ft_h = Integer.parseInt(st.nextToken());
			int ft_m = Integer.parseInt(st.nextToken());
			int ft_s = Integer.parseInt(st.nextToken());
			
			int st_sum = st_h * 60 * 60 + st_m * 60 + st_s;
			int ft_sum = ft_h * 60 * 60 + ft_m * 60 + ft_s;
			
			int wt_sum = ft_sum - st_sum;
			
			int wt_h = (wt_sum/60)/60 % 24;
			int wt_m = (wt_sum/60) % 60;
			int wt_s = wt_sum % 60;
			
			System.out.println(wt_h + " " + wt_m + " " + wt_s);
			
		}

	}

}
