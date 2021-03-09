package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11654 {
    /*
     * 아파벳 소문자, 대문자, 숫자0-9 하나가 주어짐
     * 출력: 아스키코드 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        System.out.println((int)c);
        br.close();
    }
}
