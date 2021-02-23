package step.tryIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q14681 {
    /*
     * 첫 줄에 정수 x
     * 두번째 줄에 정수 y를 입력받아
     * (x,y)의 사분면 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int r=0;
        if( x>0 && y>0 ) r = 1;
        else if( x<0 && y>0 ) r = 2;
        else if( x<0 && y<0 ) r = 3;
        else if( x>0 && y<0 ) r = 4;
        System.out.print(r);
        br.close();
    }
}
