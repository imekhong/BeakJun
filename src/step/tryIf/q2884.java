package step.tryIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2884 {
    /*
     * 첫 줄에 두 정수 H,M을 입력받아 알람시계를 맞출때
     * 맞춘 시간보다 45분 빨리 알람이 설정되게 시간 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(m < 45) {
            if( h == 0 ) h = 23;
            else h--;
            m += 15;
        }
        else m -= 45;
        sb.append(h).append(' ').append(m);
        System.out.println(sb);
        br.close();
    }
}
