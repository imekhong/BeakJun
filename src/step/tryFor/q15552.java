package step.tryFor;

import java.io.*;
import java.util.StringTokenizer;

public class q15552 {
    /*
     * 첫 줄에 입력받을 횟수 입력하고
     * 그 횟수만큼 계산할 값들 입력하고
     * 주어진 값들의 합을 출력
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = 0;
        t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(a+b));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
