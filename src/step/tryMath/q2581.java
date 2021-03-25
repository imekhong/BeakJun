package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2581 {
    /*
     * 주어진 두개의 숫자 사이의 소수합, 최소 소수 구하기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();
        int min = 10000;
        int sum = 0;
        for(int i=m; i<=n; i++){
            boolean flag = false;
            if(i==1) flag = true;
            else{
                for(int j=2; j<i; j++){
                    if(i%j == 0){
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                sum += i;
                if(min > i) min = i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
