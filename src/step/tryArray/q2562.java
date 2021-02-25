package step.tryArray;

import java.io.*;

public class q2562 {
    /*
     * 9개의 서로 다른 자연수가 주어질때,
     * 최대값을 찾고 그 수가 몇번째 수인지 구한다
     * 출력: 첫번째 줄에 최댓값
     *      두번째 줄에 몇번째
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[9];
        int max=Integer.MIN_VALUE, cnt=0;
        for(int i=0; i<9; i++){
            num[i] = Integer.parseInt(br.readLine());
            if(num[i] > max) {
                max = num[i];
                cnt = i+1;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(max).append('\n').append(cnt);
        System.out.println(sb);
        br.close();
    }
}
