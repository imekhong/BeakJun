package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1002 {
    /*
     * 터렛
     * 입력1: test case
     * 입력2: x1, y1, r1, x2, y2, r2
     * 출력: 위치 개수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double dist1 = Math.pow(x1-x2,2)+Math.pow(y1-y2,2);
            double dist2 = Math.pow(r1+r2, 2);
            double dist3 = Math.pow(r1-r2, 2);
            if(x1==x2 && y1==y2 && r1==r2) {
                sb.append("-1");
            }else if(dist1 > dist2 || dist1 < dist3 ){
                sb.append("0");
            }else if(dist1 == dist2 || dist1 == dist3){
                sb.append("1");
            }else{
                sb.append("2");
            }
            sb.append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
