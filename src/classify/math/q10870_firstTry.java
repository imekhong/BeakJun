package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10870_firstTry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] fibonacci = new int[21];
        fibonacci[0] = 0; fibonacci[1] = 1;
        for(int i=2; i<21; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        int n = Integer.parseInt(br.readLine());
        System.out.print(fibonacci[n]);
        br.close();
    }
}
