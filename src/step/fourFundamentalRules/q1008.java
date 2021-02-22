package step.fourFundamentalRules;

import java.util.Scanner;

public class q1008 {
    public static void main(String[] args) {
        /*
         * 두 정수 A와 B를 입력받아 A/B를 출력
         */
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println((double)a/b);
        sc.close();
    }
}
