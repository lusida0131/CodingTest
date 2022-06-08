package DoitCodingTest;
import java.io.*;
import java.util.*;
public class Baek2251 {
	// 6가지 이동하는 케이스를 표현하기 위한 배열 
	static int[] Sender = {0, 0, 1, 1, 2, 2};
	static int[] Receiver = {1, 2, 0, 2, 0, 1};
	static boolean visit[][];  // A, B의 무게만 있으면 C의 무게가 고정되므로 2개만 체크  
	static boolean[] answer;
	static int[] now;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		now = new int[3];    // A, B, C 물의 양을 저장하는 배열  
		for(int i = 0; i < now.length; i++) {
			now[i] = Integer.parseInt(st.nextToken());
		}
		visit = new boolean[201][201];
		answer = new boolean[201];
		BFS();
		for(int i = 0; i < answer.length; i++) {
			if(answer[i]) {
				System.out.print(i + " ");
			}
		}
	}
	private static void BFS() {
		Queue<AB> que = new LinkedList<>();
		que.add(new AB(0, 0));
		visit[0][0] = true;
		answer[now[2]] = true;
		while(!que.isEmpty()) {
			AB p = que.poll();
			int A = p.A;
			int B = p.B;
			int C = now[2] - A - B;      // C는 전체 물의 양에서 A와 B를 뺀 
			for(int k = 0; k < 6; k++) {  // A -> B, A -> C, B->A, B->C, C->A, C->B
				int[] next = {A, B, C};
				next[Receiver[k]] += next[Sender[k]];
				next[Sender[k]] = 0;
				if(next[Receiver[k]] > now[Receiver[k]]) {  // 물이 넘칠 때 
					// 초과하는 만큼 다시 이전 물통에 넣어 줌 
					next[Sender[k]] = next[Receiver[k]] - now[Receiver[k]];
					next[Receiver[k]] = now[Receiver[k]]; // 대상 물통은 최대로 채워 줌 
				}
				if(!visit[next[0]][next[1]]) {       // A와 B의 물의 양을 이용해 방문 배열 체크 
					visit[next[0]][next[1]] = true;
					que.add(new AB(next[0], next[1]));
					if(next[0] == 0) {  // A의 물의 양이 0일 때 C의 물의 무게를 정답 변수에 저장 
						answer[next[2]] = true;
					}
				}
			}
		}
	}
}
// AB 클레스 선언-> A와 B의 값만 지니고 있으면 C는 유추할 수 있으므로 두 변수만 사용하기  
class AB {
	int A;
	int B;
	public AB(int A, int B) {
		this.A = A;
		this.B = B;
	}
}