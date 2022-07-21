package programmers;
import java.util.*;

public class step2_1 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, 
								{"blue", "eyewear"}, 
								{"green_turban", "headgear"}};
		HashMap<String, Integer> map = new HashMap<>();
		int answer = 1;
		for(int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			answer *= map.get(key) + 1;
		}
		System.out.println(answer - 1);
	}
}
