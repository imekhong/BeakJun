package step.tryArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1546 {
    /*
     * 조작된 평균 구하기
     * 첫번째 줄: 입력할 점수의 갯수를 입력
     * 두번째 줄: 점수를 띄어쓰기로 구분하여 입력
     * 모든 점수에 대해 (각 점수)/(최고 점수*100)한 점수의 평균
     * 출력: 평균 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] score = new double[num];
        double max = 0, sum = 0;
        for(int i=0; i<num; i++){
            score[i] = Double.parseDouble(st.nextToken());
            sum += score[i];
            if(score[i] > max) max = score[i];
        }
        System.out.print(sum*100/(num*max));
        br.close();
    }
}
