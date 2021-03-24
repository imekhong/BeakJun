package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10250 {
    /*
     * 입력 첫줄: T - test case
     * 아랫 줄(각각 T번 입력): H W N - 호텔 층수, 방수, 몇번째 손님
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(n%h == 0) {
                sb.append(h);
                if(n/h <10) sb.append(0);
                sb.append(n/h);
            }
            else {
                sb.append(n%h);
                if(n/h+1 <10) sb.append(0);
                sb.append(n/h+1);
            }
            sb.append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
