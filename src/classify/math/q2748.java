package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class q2748 {
    /*
     * 피보나치 수
     * 입력한 위치의 피보나치수를 출력
     * n은 90보다 작거나 같은 자연수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] fibonacci = new BigInteger[n+2];
        fibonacci[0] = BigInteger.valueOf(0); fibonacci[1] = BigInteger.valueOf(1);
        for(int i=2; i<n+1; i++) {
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
        }
        System.out.print(fibonacci[n]);
        br.close();
    }
}
