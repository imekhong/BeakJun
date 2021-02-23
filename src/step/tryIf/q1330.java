package step.tryIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1330 {
    /*
     * 두 정수 A,B를 입력받아 비교 출력
     * A가 B보다 클때 > 출력
     * A가 B보다 작을때 < 출력
     * A와 B가 같을때 == 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if( a > b ) System.out.println(">");
        else if( a < b ) System.out.println("<");
        else System.out.println("==");
    }
}
