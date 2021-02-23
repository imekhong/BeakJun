package step.fourFundamentalRules;

import java.io.*;
import java.util.StringTokenizer;

public class q10998 {
    /*
     * 두 정수 A와 B를 입력받아 A*B를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a*b));
        br.close();
        bw.flush();
        bw.close();
    }
}
