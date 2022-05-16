package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek12891 {
	static int [] checkArr;
	static int [] myArr;
	static int checkInt;
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char [] str = br.readLine().toCharArray();
		checkArr = new int [4];
		myArr = new int [4];
		checkInt = 0;
		result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkInt++;
			}
		}
		for(int i = 0; i < m; i++) {
			Add(str[i]);
		}
		if(checkInt == 4) {
			result++;
		}
		for(int i = m; i < n; i++) {
			int j = i - m;
			Add(str[i]);
			Remove(str[j]);
			if(checkInt == 4) {
				result++;
			}
		}
		System.out.println(result);
		br.close();
	}

	private static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0] == checkArr[0]) {
				checkInt--;
			}
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1]) {
				checkInt--;
			}
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2]) {
				checkInt--;
			}
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3]) {
				checkInt--;
			}
			myArr[3]--;
			break;
		}		
	}

	private static void Add(char c) {
		switch(c) {
			case 'A' :
				myArr[0]++;
				if(myArr[0] == checkArr[0]) {
					checkInt++;
				}
				break;
			case 'C' :
				myArr[1]++;
				if(myArr[1] == checkArr[1]) {
					checkInt++;
				}
				break;
			case 'G' :
				myArr[2]++;
				if(myArr[2] == checkArr[2]) {
					checkInt++;
				}
				break;
			case 'T' :
				myArr[3]++;
				if(myArr[3] == checkArr[3]) {		
					checkInt++;
				}
				break;
		}
	}
}
