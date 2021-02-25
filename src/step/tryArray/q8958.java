package step.tryArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q8958 {
    /*
     * OX 퀴즈 점수 매기기
     * ex) OOXXOXXOOO 점수는 1+2+0+0+1+0+0+1+2+3=10점
     * 첫줄: 테스트 케이스 수
     * 두번째 줄: 각각 원하는 갯수만큼의 OX를 테스트케이스 수만큼 줄 추가
     * 출력: 각줄의 점수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];
        for(int i = 0; i<num; i++){
            str[i] = br.readLine();
            int score = 1, sum = 0;
            for(int j = 0; j<str[i].length(); j++){
                if( str[i].charAt(j) == 'O' ){
                    sum += score;
                    score++;
                }else score = 1;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
        br.close();
    }
}
