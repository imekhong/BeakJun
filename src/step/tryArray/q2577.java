package step.tryArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2577 {
    /*
     * 세개의 자연수 A,B,C가 주어질때
     * A X B X C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇번씩 쓰였는지
     * 출력: 첫번째 줄 0이 몇번쓰임 두번째 줄 1이 몇번쓰임~10번째 줄 9가 몇번쓰임
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int res = A*B*C;
        int[] num = new int[10];
        while(res != 0){
            num[res%10] += 1;
            res /= 10;
        }
        for(int j : num)
            sb.append(j).append('\n');
        System.out.print(sb);
        br.close();
    }
}
