package step.fourFundamentalRules;

import java.io.*;
import java.util.StringTokenizer;

public class q10869 {
    /*
     * 두 정수 A,B를 입력받아 +,-,*,/,% 값 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(a+b).append('\n')
                .append(a-b).append('\n')
                .append(a*b).append('\n')
                .append(a/b).append('\n')
                .append(a%b);
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
