package step.tryWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10952 {
    /*
     * 여러번의 두수(A,B)를 입력 받고
     * 입력의 마지막에는 0 두개가 들어온다
     * 그러고 나면 각줄의 A+B 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            sb.append(a+b).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
