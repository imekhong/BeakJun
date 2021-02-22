package step.fourFundamentalRules;

import java.util.Scanner;

public class q2588 {
    public static void main(String[] args) {
        /*
         * 두 세자리 숫자를 입력받아
         * 곱셈하는 과정을 출력
         */
        int num1, num2;
        int[] numCon = new int[3];

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for(int i=0; i<3; i++) {
            numCon[i] = num2%10;
            num2 = num2/10;
            System.out.println("numCon["+i+"] = "+numCon[i]);
        }
        int sol3 = num1*numCon[0];
        int sol4 = num1*numCon[1];
        int sol5 = num1*numCon[2];
        int result = num1*num2;
        System.out.println(sol3);
        System.out.println(sol4);
        System.out.println(sol5);
        System.out.println(result);
        sc.close();
    }
}
