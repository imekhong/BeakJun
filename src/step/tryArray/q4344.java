package step.tryArray;

import java.io.*;
import java.util.StringTokenizer;

public class q4344 {
    /*
     * 첫 줄: 테스트 케이스 수
     * 두번째 줄~: 각 테스트 케이스마다 학생수가 첫수이고
     *           그 뒤로는 N명의 점수가 주어진다
     * 출력: 평균을 넘는 학생의 비율을 소숫점 셋째자리까지 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        for(int i = 0; i<c; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            int sum=0, cnt=0;
            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double avg = (double) sum/n;
            for(double tmp : arr){
                if(tmp > avg) cnt++;
            }
            double result = (double) cnt*100/n;
            sb.append(String.format("%.3f", result)).append("%\n");
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
