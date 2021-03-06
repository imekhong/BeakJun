package step.tryFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10950_firstTry {
    public static void main(String[] args) {
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
