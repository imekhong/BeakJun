package step.fourFundamentalRules;

import java.util.Scanner;

public class q10869 {
    public static void main(String[] args) {
        /*
         * 두 정수 A,B를 입력받아 +,-,*,/,% 값 출력
         */
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        sc.close();
    }
}
