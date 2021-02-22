package step.tryFor;

import java.util.Scanner;

public class q8393 {
    public static void main(String[] args) {
        /*
         * 첫 줄에 정수 n을 입력받아
         * 1부터 n까지 합 출력
         */
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        n = input.nextInt();
        input.close();
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
