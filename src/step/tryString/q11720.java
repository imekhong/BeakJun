package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11720 {
    /*
     * 첫줄에 숫자개수 N(0<N<101)
     * 두번째줄에 N개의 숫자붙여서
     * 출력: 숫자들 합
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;
        for(int i=0; i<num.length(); i++)
            sum += num.charAt(i)-'0';
        System.out.println(sum);
        br.close();
    }
}
