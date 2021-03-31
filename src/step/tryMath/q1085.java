package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1085 {
    /*
     * 직사각형에서 탈출
     * 입력: x,y,w,h
     * 출력: 사각형의 경계선까지 가는 거리의 최소값
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int minX = (x <= w/2)? x:w-x;
        int minY = (y <= h/2)? y:h-y;
        System.out.print( (minX <= minY)? minX:minY );
        br.close();
    }
}
