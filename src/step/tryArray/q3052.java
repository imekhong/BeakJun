package step.tryArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q3052 {
    /*
     * 수 10개를 입력 받아 42로 나누고 나머지를 구해서
     * 서로 다른 값이 몇개 있는지 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[10];
        for(int i=0; i<10; i++)
            num[i] = Integer.parseInt(br.readLine())%42;
        Arrays.sort(num);
        int cnt = 1;
        for(int i=1; i<10; i++) {
            if (num[i - 1] != num[i])  cnt++;
        }
        System.out.println(cnt);
    }
}
