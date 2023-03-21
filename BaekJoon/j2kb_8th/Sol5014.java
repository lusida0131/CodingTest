package j2kb_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol5014 {
	static int f, s, g, u, d;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		f = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		g = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		visited = new boolean[f + 1];
		int result = bfs();
		if(result < 0) {
			System.out.println("use the stairs");
		}
		else {
			System.out.println(result);
		}
	}
	private static int bfs() {
		Queue<Node> que = new LinkedList<>();
		que.offer(new Node(s, 0));
		visited[s] = true;
		while(!que.isEmpty()) {
			Node current = que.poll();
			if(current.x == g) {
				return current.cost;
			}
			if(current.x + u <= f && visited[current.x + u] == false) {
                que.offer(new Node(current.x + u, current.cost + 1));
                visited[current.x + u] = true;
            }
            if(current.x - d >= 1 && visited[current.x - d] == false) {
                que.offer(new Node(current.x - d, current.cost + 1));
                visited[current.x - d] = true;
            }
		}
		return -1;
	}
	public static class Node {
        int x;
        int cost;
        
        public Node(int x, int cost) {
            this.x = x;
            this.cost = cost;
        }
    }
}
