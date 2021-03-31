package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4948_firstTry {
    /*
     * 입력된 수가 n이라면 n보다크고 2n보다 작거나 같은 수 중에
     * 소수의 개수를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            boolean[] prime = new boolean[2*num+1];
            int cnt = 0;
            for(int i=2; i<2*num+1; i++){
                if(prime[i]) continue;
                if(i > num) cnt++;
                for(int j=i+i; j<2*num+1; j+=i){
                    prime[j] = true;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
