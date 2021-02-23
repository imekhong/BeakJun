package step.tryFor;

import java.io.*;
import java.util.StringTokenizer;

public class q11022 {
    /*
     * 테스트케이스를 입력 받아
     * 각 테스트케이스는 한줄이며 각줄에 A,B가 주어지고
     * 모두 입력받은 후 Case #x: A+B = C를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String s = "Case #"+i+": "+a+" + "+b+" = "+(a+b);
            sb.append(s).append('\n');
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
