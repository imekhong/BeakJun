package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q4153 {
    /*
     * 피타고라스의 정리
     * 입력: 여러개의 테스트케이스로 주어지고 마지막은 0 0 0
     * 출력: 직각 삼각형이면 right 아니면 wrong
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if( a+b+c == 0) break;
            if((a*a + b*b) == c*c ||
                    (b*b + c*c) == a*a ||
                    (a*a + c*c) == b*b ){
                sb.append("right");
            }else{
                sb.append("wrong");
            }
            sb.append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
