package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2749_withPisanoPeriod {
    /*
     * 피보나치 수 with 피사노 주기(pisano period)
     * 입력한 위치의 피보나치수를 1000000으로 나눈 나머지 출력
     * n은 1,000,000,000,000,000,000보다 작거나 같은 자연수
     * 피사노 주기: 피보나치 수를 K로 나누었을때 항상 주기를 가진다.
     * 주기 길이를 P라고 하면  N번째 피보나치 수를 K로 나눈 나머지는 N%P번째 피보나치 수를 K로 나눈 나머지와 같다. [ fibo(N) % K = fibo(N%K) % K ]
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int pisano = 1500000;
        long[] arr = new long[pisano];
        arr[0] = 0; arr[1] = 1;
        for(int i=2 ; i<pisano && i<=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000;
        }
        if(n >=pisano){
            n %= pisano;
        }
        System.out.println(arr[(int) n]);
    }
}
