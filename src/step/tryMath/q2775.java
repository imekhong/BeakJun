package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2775 {
    /*
     * a층 b호에 살려면 (a-1)층의 1호부터 b호까지 사람 수만큼 살아야한다
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];
        for(int i=0; i<15; i++){
            apt[0][i] = i;
            apt[i][1] = 1;
        }
        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                apt[i][j] = apt[i][j-1]+apt[i-1][j];
            }
        }
        for(int i=0; i<t; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(apt[a][b]).append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
