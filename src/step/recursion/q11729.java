package step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11729 {
    /*
     * 하노이 탑 이동 순서
     * 입력: 쌓인 원판 개수 N
     * 출력1: 옮긴 횟수 k
     * 출력2: A B (A장대 맨위 원판을 B장대에 옮긴다는 뜻)
     */
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        move(n, 1, 3);
        System.out.println(cnt);
        System.out.print(sb);
    }
    public static void move(int n, int x, int y){
        cnt++;
        sb.append(x).append(' ').append(y).append('\n');
        if (n > 1) {
            move(n-1, x, 6-x-y);
        }
        if (n > 1) {
            move(n-1, 6-x-y, y);
        }
    }
}
