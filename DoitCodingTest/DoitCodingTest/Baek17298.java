package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek17298 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n]; //수열배열 생성 
		int [] answer = new int [n]; //정답 배열 생성 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0); // 처음에는 항상 스택이 비어 있으므로 최초 값을 push해 초기화 
		for(int i = 1; i < n; i++) {
			//스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우 
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				answer[stack.pop()] = arr[i]; // 정답 배열에 오큰수를 현재 수열로 저장하기 
			}
			stack.push(i);  //신규 데이터 push 
		}
		while(!stack.isEmpty()) { //반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지 
			answer[stack.pop()] = -1; //스택에 쌓인 index에 -1을 넣고 
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < n; i++) {
			bw.write(answer[i] + " ");
		}
		bw.close();
		br.close();
	}
}
