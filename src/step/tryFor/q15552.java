package step.tryFor;

import java.io.*;
import java.util.StringTokenizer;

public class q15552 {
    public static void main(String[] args) {
        /*
         * 첫 줄에 입력받을 횟수 입력하고
         * 그 횟수만큼 계산할 값들 입력하고
         * 주어진 값들의 합을 출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = 0;
        try {
            t = Integer.parseInt(br.readLine());
            int[][] putInt = new int[t][2];

            for(int i=0; i<t; i++) {
                String s = br.readLine();
                StringTokenizer st = new StringTokenizer(s);
                putInt[i][0] = Integer.parseInt(st.nextToken());
                putInt[i][1] = Integer.parseInt(st.nextToken());
            }
            br.close();

            for(int j=0; j<t; j++) {
                int sum = putInt[j][0]+putInt[j][1];
                bw.write(Integer.toString(sum));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
