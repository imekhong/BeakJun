package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2908_firstTry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        int ax = 0, bx=0;
        for(int i=0; i<3; i++){
            ax += (a.charAt(i)-48)*(int)Math.pow(10.0,(double)i);
            bx += (b.charAt(i)-48)*(int)Math.pow(10.0,(double)i);
        }
        System.out.println(ax>bx?ax:bx);
        br.close();
    }
}
