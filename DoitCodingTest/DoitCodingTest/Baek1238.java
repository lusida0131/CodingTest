package DoitCodingTest;
import java.util.*;
import java.io.*;

public class Baek1238 {
	static int[] distance;
	static boolean[] visit;
	static ArrayList<Circle>[] list;
	static PriorityQueue<Circle> que = new PriorityQueue<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		visit = new boolean[n + 1];
		list = new ArrayList[n + 1];
		distance = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Circle>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list[u].add(new Circle(v, w));
		}
		int time[] = new int[n+1];
        for(int i = 1; i <= n; i++) {
            dijkstra(i);
            time[i] += distance[x];
        }
        
        dijkstra(x);
        for(int i = 1; i <= n; i++)
            time[i] += distance[i];
        
        int max = 0;
        for(int i = 1; i <= n; i++) 
            max = Math.max(max, time[i]);
    
        System.out.println(max);
	}

	private static void dijkstra(int x) {
		que.offer(new Circle(x, 0));
		visit = new boolean[visit.length];
		distance = new int[distance.length];
        Arrays.fill(distance, -1);
		distance[x] = 0;
		while(!que.isEmpty()) {
			Circle current = que.poll();
			int c_v = current.vertex;
			if(visit[c_v]) {
				continue;
			}
			visit[c_v] = true;
			for(int i = 0; i < list[c_v].size(); i++) {
				Circle tmp = list[c_v].get(i);
				int next = tmp.vertex;
				int value = tmp.value;
				if(distance[next] == -1 || distance[next] > distance[c_v] + value) {
					distance[next] = distance[c_v] + value;
					que.add(new Circle(next, distance[next]));
				}
			}
		}	
	}
}	
class Circle implements Comparable<Circle> {
	int vertex, value;
	Circle(int vertex, int value) {
		this.vertex = vertex;
		this.value = value;
	}
	@Override
	public int compareTo(Circle o) {
		return value - o.value;
	}
}