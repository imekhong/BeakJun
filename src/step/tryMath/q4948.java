package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4948 {
    /*
     * 입력된 수가 n이라면 n보다크고 2n보다 작거나 같은 수 중에
     * 소수의 개수를 출력
     */
    public static boolean[] prime = new boolean[246913];
    public static int[] count_arr = new int[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        get_prime();
        get_count();
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            sb.append(count_arr[2*num]-count_arr[num]).append('\n');
        }
        System.out.print(sb);
        br.close();
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
    public static void get_count(){
        int count = 0;
        for(int i=2; i<prime.length; i++){
            if(!prime[i]) count++;
            count_arr[i] = count;
        }
    }
}
