package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1978 {
    /*
     * 입력된 숫자에서 소수의 개수를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(st.nextToken());
            boolean flag = false;
            if(n != 1) {
                for (int j = 2; j < n; j++){
                    if ( n%j == 0) {
                        flag = true;
                        break;
                    }
                }
            }else {
                flag = true;
            }
            if(!flag) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
