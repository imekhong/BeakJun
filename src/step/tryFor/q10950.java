package step.tryFor;

import java.io.*;
import java.util.StringTokenizer;

public class q10950 {
    /*
     * 첫 줄에 테스트를 진행할 횟수를 입력받고
     * 그 다음 줄에는 덧셈을 진행할 숫자 두개씩 첫 줄에 입력한 횟수만큼 입력
     * 다 입력되면 덧셈 출력(첫 줄에 입력한 숫자의 갯수 만큼 결과값 나옴)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append('\n');
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
