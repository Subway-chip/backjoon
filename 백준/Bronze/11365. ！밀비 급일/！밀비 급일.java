import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer sb = new StringBuffer();

		while (true) {
			String str = br.readLine();

			if (str.equals("END")) {
				break;
			}
			StringBuffer reverseStr = new StringBuffer(str);
			reverseStr = reverseStr.reverse();
			sb.append(reverseStr + "\n");

		}
		System.out.println(sb);

	}

}
