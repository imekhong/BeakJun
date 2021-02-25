package step.tryArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q8958_withoutArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num; i++){
            String str = br.readLine();
            int score = 1, sum = 0;
            for(int j = 0; j<str.length(); j++){
                if( str.charAt(j) == 'O' ){
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
