package step.fourFundamentalRules;

import java.io.*;
import java.util.StringTokenizer;

public class q10430 {
    /*
     * 세 정수 A,B,C를 입력받아
     * (A+B)%C
     * ((A%C)+(B%C))%C
     * (AXB)%C
     * ((A%C)X(B%C))%C
     * 결과값을 순서대로 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        sb.append((a+b)%c).append('\n')
                .append(((a%c)+(b%c))%c).append('\n')
                .append((a*b)%c).append('\n')
                .append(((a%c)*(b%c))%c);
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
