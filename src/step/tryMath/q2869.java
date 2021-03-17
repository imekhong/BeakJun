package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2869 {
    /*
     * 달팽이가 V미터인 막대를 올라가는데
     * 낮에는 A미터 가지만 밤에자는동안 B미터 미끄러진다
     * 막대를 모두 올라가는데 얼마나 걸림?
     * 입력: A B V
     * 출력: 걸리는 기간
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = (V-B)/(A-B);
        if((V-B)%(A-B) != 0) day++;
        System.out.println(day);
        br.close();
    }
}