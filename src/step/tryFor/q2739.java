package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2739 {
    /*
     * 구구단 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<10; i++)
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append('\n');
        System.out.print(sb);
        br.close();
    }
}
