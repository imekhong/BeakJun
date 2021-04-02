package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class q2748_withoutArray {
    /*
     * 피보나치 수
     * 입력한 위치의 피보나치수를 출력
     * n은 90보다 작거나 같은 자연수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger pre1 = BigInteger.valueOf(1);
        BigInteger pre2 = BigInteger.valueOf(0);
        BigInteger num = BigInteger.valueOf(0);;
        if (n == 0) {
            num = pre2;
        }else if(n == 1){
            num = pre1;
        }else {
            for(int i=0; i<n-1; i++){
                num = pre1.add(pre2);
                pre2 = pre1;
                pre1 = num;
            }
        }
        System.out.print(num);
        br.close();
    }
}
