package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2292 {
    /*
     * 홈페이지 참조:https://www.acmicpc.net/problem/2292
     * 입력: 숫자
     * 출력: 1에서 숫자까지 가는데 몇개의 방을 지나는지
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = 1;
        int max = 1;
        while(true){
            if(x<=max) break;
            max += 6*(n++);
        }
        System.out.println(n);
        br.close();
    }
}
