package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2747_withoutArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long pre1 = 1;
        long pre2 = 0;
        long num = 0;
        if (n == 0) {
            num = pre2;
        }else if(n == 1){
            num = pre1;
        }else {
            for(int i=0; i<n-1; i++){
                num = pre1+pre2;
                pre2 = pre1;
                pre1 = num;
            }
        }
        System.out.print(num);
        br.close();
    }
}
