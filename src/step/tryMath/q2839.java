package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2839 {
    /*
     * 3kg, 5kg 짜리가 있다
     * 첫줄에 필요한 무게
     * 출력: 배달하는 봉지 최소 개수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = -1;
        // n = 3x+5y 중 x+y가 제일 작은 수를 구하기
        for(int x=0; x<=(n/3); x++){
            for(int y=0; y<=(n/5); y++)
                if (n == (5 * x + 3 * y)) {
                    r = x + y;
                    break;
                }
            if(r != -1) break;
        }
        System.out.println(r);
        br.close();
    }
}
