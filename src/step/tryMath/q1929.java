package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1929 {
    /*
     * 주어진 자연수 M N 사이의 소수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            if(prime[i]) continue;
            if(i>=m) sb.append(i).append('\n');
            for(int j=i+i; j<=n; j+=i){
                if(prime[j]) continue;
                prime[j] = true;
            }
        }
        System.out.print(sb);
        br.close();
    }
}
