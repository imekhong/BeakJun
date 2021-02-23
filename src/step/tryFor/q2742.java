package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2742 {
    /*
     * N부터 1까지 한 줄에 하나씩 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=n; i>0; i--) sb.append(i).append('\n');
        System.out.print(sb);
        br.close();
    }
}
