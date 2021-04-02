package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class q10826 {
    /*
     * 피보나치 수
     * 입력한 위치의 피보나치수를 출력
     * n은 10000보다 작거나 같은 자연수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] f = new BigInteger[n+2];
        f[0] = BigInteger.ZERO;
        f[1] = BigInteger.ONE;
        for(int i=2; i<=n; i++) {
            f[i] = f[i-1].add(f[i-2]);
        }
        System.out.print(f[n]);
        br.close();
    }
}
