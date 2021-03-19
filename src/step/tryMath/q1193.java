package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1193 {
    /*
     * 1/1, 1/2, 2/1, 3/1, 2/2, 1/3,....의 규칙의 수에서
     * X가 주어졌을때 X번째 분수 구하기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = 1, end=0, start=1;
        for(int i=1; ; i++) {
            end += i;
            if (x <= end) break;
            n++;
            start = end + 1;
        }
        //짝수 그룹: n+1/1부터 시작
        //홀수 그룹: 1/n+1부터 시작
        int s = 0;
        if(n%2 == 0){
            s = x - start + 1;
        }else{
            s = end - x + 1;
        }
        int m = n + 1 - s;
        System.out.println(s+"/"+m);
        br.close();
    }
}
