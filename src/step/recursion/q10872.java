package step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10872 {
    /*
     * 팩토리얼 구현
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(factorial(n));
        br.close();
    }
    public static int factorial(int n){
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }
}
