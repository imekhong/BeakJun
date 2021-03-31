package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9020 {
    /*
     * 테스트 케이스와 골드바흐 파티션을 구할 숫자 입력
     * 골드바흐 파티션 출력
     */

    public static boolean[] prime = new boolean[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        get_prime();
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=n/2; j>1; j--){
                if(!prime[j] && !prime[n-j]) {
                    sb.append(j).append(' ').append(n - j);
                    break;
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    public static void get_prime(){
        prime[0] = true;
        prime[1] = true;
        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
