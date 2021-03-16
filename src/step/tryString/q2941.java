package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2941 {
    /*
     * c= , c- , dz= , d- , lj , nj , s= , z=
     * 입력: 최대 100글자의 단어
     * 출력: 크로아티아 알파벳 개수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ca = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String str = br.readLine();
        for(String tmp: ca) {
            str = str.replace(tmp, "*");
        }
        System.out.println(str.length());
        br.close();
    }
}
