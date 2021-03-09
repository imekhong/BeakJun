package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2675 {
    /*
     * 입력: test case 수
     *      반복수 단어 ->test case 만큼 입력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int cnt = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0; j<str.length(); j++){
                char tmp = str.charAt(j);
                for(int l=0; l<cnt; l++){
                    sb.append(tmp);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
