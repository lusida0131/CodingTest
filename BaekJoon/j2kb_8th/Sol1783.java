package j2kb_8th;

import java.util.Scanner;
/*
	1번: 2칸 위로, 1칸 오른쪽
	2번: 1칸 위로, 2칸 오른쪽
	3번: 1칸 아래로, 2칸 오른쪽
	4번: 2칸 아래로, 1칸 오른쪽
*/
public class Sol1783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        if (n == 1) { //세로칸이 1일경우 이동 불가
            cnt = 1;
        } else if (n == 2) {//세로칸이 2일경우 2,3번 방향으로만 이동 가능, 1~4번 전부 이동 불가능
            cnt = Math.min((m + 1) / 2, 4);
        } else {//세로칸이 3칸 이상일 경우
        	// M=7 부터 4방향 다 이동 가능
            // 4방향 다 이동한 후에는 y값이 1씩 증가하는 1번,4번 이동을 반복
            // 즉, M-2개의 칸을 갈 수 있음
            if (m <  7){
                cnt = Math.min(m, 4);
            } else {
                cnt = m - 2;
            }
        }
        System.out.println(cnt);

	}

}