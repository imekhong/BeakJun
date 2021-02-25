package step.tryArray;

import java.io.*;
import java.util.StringTokenizer;

public class q10818 {
    /*
     * 첫 줄에 N개의 정수가 주어지고
     * 두번째줄에 N개의 정수를 공백으로 구분하여 입력
     * 출력: 최소값 최대값
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
            /* Math의 min, max 쓰는게 더 빠름
            if(num[i]<min) min = num[i];
            if(num[i]>max) max = num[i];
             */
            min = Math.min(num[i], min);
            max = Math.max(num[i], max);
        }
        System.out.printf("%d %d", min, max);
        br.close();
    }
}
