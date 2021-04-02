package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2749 {
    /*
     * 피보나치 수 with 피사노 주기(pisano period)
     * 입력한 위치의 피보나치수를 1000000으로 나눈 나머지 출력
     * n은 1,000,000,000,000,000,000보다 작거나 같은 자연수
     * 피사노 주기: 피보나치 수를 K로 나누었을때 항상 주기를 가진다.
     * 주기 길이를 P라고 하면  N번째 피보나치 수를 K로 나눈 나머지는 N%P번째 피보나치 수를 K로 나눈 나머지와 같다. [ fibo(N) % K = fibo(N%K) % K ]
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long a = 0;
        long b = 1;
        long c = 1;
        n %= 1500000;
        for(long i = 1;i<=n-1;i++){
            c = (a+b)%1000000;
            a = b;
            b = c;
        }
        System.out.print(c);
    }
}
