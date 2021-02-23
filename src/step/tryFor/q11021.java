package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11021 {
    /*
     * 테스트케이스를 입력 받아
     * 각 테스트케이스는 한줄이며 각줄에 A,B가 주어지고
     * 모두 입력받은 후 Case #x: A+B를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String s = "Case #"+i+": "+(a+b);
            sb.append(s).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
