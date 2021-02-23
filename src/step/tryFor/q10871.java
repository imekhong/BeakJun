package step.tryFor;

import java.io.*;
import java.util.StringTokenizer;

public class q10871 {
    /*
     * N과 X를 입력받아
     * 수열 A를 이루는 정수 N개가 주어지고
     * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a < x)
                sb.append(a).append(" ");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
