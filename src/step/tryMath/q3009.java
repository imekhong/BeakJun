package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3009 {
    /*
     * 사각형의 세점이 주어질때 나머지 한 점의 좌표 구하기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x1 = 0, x2 = 0;
        int y1 = 0, y2 = 0;
        int sumX = 0, sumY = 0;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int tX = Integer.parseInt(st.nextToken());
            int tY = Integer.parseInt(st.nextToken());
            if(x1 == 0){
                x1 = tX;
            }else if(x1 != tX && x2 == 0) {
                x2 = tX;
            }
            if(y1 == 0){
                y1 = tY;
            }else if(y1 != tY && y2 == 0){
                y2 = tY;
            }
            sumX += tX;
            sumY += tY;
        }
        System.out.printf("%d %d", (2*x1+2*x2-sumX), (2*y1+2*y2-sumY));
    }
}
