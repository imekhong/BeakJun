package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] fibonacci = new long[n+2];
        fibonacci[0] = 0; fibonacci[1] = 1;
        for(int i=2; i<n+1; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.print(fibonacci[n]);
        br.close();
    }
}
