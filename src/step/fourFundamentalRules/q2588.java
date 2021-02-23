package step.fourFundamentalRules;

import java.io.*;

public class q2588 {
    /*
     * 두 세자리 숫자를 입력받아
     * 곱셈하는 과정을 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int r = num1 * num2;
        for(int i=0; i<3; i++) {
            bw.write(String.valueOf(num1*(num2%10)));
            num2 = num2/10;
            bw.write('\n');
        }
        bw.write(String.valueOf(r));
        br.close();
        bw.flush();
        bw.close();
    }
}
