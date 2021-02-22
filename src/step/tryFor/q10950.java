package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10950 {
    public static void main(String[] args) {
        /*
         * 첫 줄에 테스트를 진행할 횟수를 입력받고
         * 그 다음 줄에는 덧셈을 진행할 숫자 두개씩 첫 줄에 입력한 횟수만큼 입력
         * 다 입력되면 덧셈 출력(첫 줄에 입력한 숫자의 갯수 만큼 결과값 나옴)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());
            int[][] putInt = new int[num][2];

            for(int i=0; i<num; i++) {
                String s = br.readLine();
                String[] str = s.split(" ");
                putInt[i][0] = Integer.parseInt(str[0]);
                putInt[i][1] = Integer.parseInt(str[1]);
            }
            for(int j=0; j<num; j++) {
                System.out.println(putInt[j][0]+putInt[j][1]);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
