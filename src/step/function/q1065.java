package step.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1065 {
    /*
     * 등차수열: 연속된 두개의 수의 차가 일정한 수열
     * 한수: 어떤 양의 정수 X의 각 자리가 등차수열을 이룸
     * 입력: 정수 N (1<= N < 1000)
     * 출력: 1보다 크거나 같고 N보다 작거나 같은 한수의 개수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(num<100){
            cnt = num;
        }else{
            cnt = 99;
            for(int i=100; i<=num; i++){
                int a = i/100;
                int b = i/10%10;
                int c = i%10;
                if(a-b == b-c) cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
