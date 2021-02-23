package step.tryFor;

import java.io.*;

public class q2439 {
    /*
     * 첫번째 줄부터 N번째 줄까지 차례대로 별 출력(오른쪽 정렬느낌)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) {
            for (int j = n-i; j >= 1; j--) bw.write(' ');
            for (int k = 0; k < i; k++) bw.write('*');
            bw.write('\n');
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
