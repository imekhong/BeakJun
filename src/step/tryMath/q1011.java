package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1011 {
    /*
     * test case
     * x지점 y 지점 입력(test case 만큼)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = y-x;
            int max = (int)Math.sqrt(d);
            if(max == Math.sqrt(d)){
                sb.append(max*2 - 1);
            }else if(d <= max*max+max){
                sb.append(max*2);
            }else{
                sb.append(max*2+1);
            }
            sb.append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
