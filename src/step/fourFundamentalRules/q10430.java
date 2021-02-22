package step.fourFundamentalRules;

import java.util.Scanner;

public class q10430 {
    public static void main(String[] args) {
        /*
         * 세 정수 A,B,C를 입력받아
         * (A+B)%C
         * ((A%C)+(B%C))%C
         * (AXB)%C
         * ((A%C)X(B%C))%C
         * 결과값을 순서대로 출력
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
        sc.close();
    }
}
