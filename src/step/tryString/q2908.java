package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2908 {
    /*
     * 3자리 숫자 두개를 입력받아
     * 각 3자리를 거꾸로 읽었을때 더 큰수 출력(결과 또한 거꾸로)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println( a > b? a : b);
    }
}
