package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1085_tryWithMath {
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
        System.out.print(Math.min(Math.min(x,w-x),Math.min(y,h-y)));
        br.close();
    }
}
