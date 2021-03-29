package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11653 {
    /*
     * 주어진 숫자의 소인수분해 결과 출력
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        if (n != 1) {
            StringBuffer sb = new StringBuffer();
            int[] arr = new int[n];
            int idx = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) arr[idx++] = i;
            }
            while (n != 1) {
                for (int i = 0; i < idx; i++) {
                    if (n % arr[i] == 0) {
                        n /= arr[i];
                        sb.append(arr[i]).append('\n');
                        break;
                    }
                }
            }
            System.out.print(sb);
        }
    }
}
