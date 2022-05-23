package DoitCodingTest;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Baek1427 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int []arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - 48;
		}
		List<Integer> integer = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(integer, Comparator.reverseOrder());
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(integer.get(i));
		}
		
	}

}
