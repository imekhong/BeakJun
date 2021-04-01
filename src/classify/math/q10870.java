package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10870 {
    /*
     * 피보나치 수
     * 입력한 위치의 피보나치수를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fibonacci = new int[n+2];
        fibonacci[0] = 0; fibonacci[1] = 1;
        for(int i=2; i<n+2; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.print(fibonacci[n]);
        br.close();
    }
}
