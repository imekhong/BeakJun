package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2741 {
    /*
     * 1부터 N까지 한 줄에 하나씩 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) sb.append(i).append('\n');
        System.out.println(sb);
        br.close();
    }
}
