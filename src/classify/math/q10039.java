package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10039 {
    /*
     * 평균 구하기
     * 입력: 5줄
     * 40미만은 40으로 계산하여 평균 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<5; i++){
            int num = Integer.parseInt(br.readLine());
            if(num < 40) sum += 40;
            else sum += num;
        }
        System.out.print(sum/5);
        br.close();
    }
}
