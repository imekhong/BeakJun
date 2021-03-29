package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1929_firstTry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        for(int i=m; i<=n; i++){
            boolean flag = false;
            if(i != 1) {
                for (int j = 2; j <= Math.sqrt(i); j++){
                    if ( i%j == 0) {
                        flag = true;
                        break;
                    }
                }
            }else {
                flag = true;
            }
            if(!flag) {
                sb.append(i).append('\n');
            }
        }
        System.out.print(sb);
        br.close();
    }
}
