package step.tryFor;

import java.util.Scanner;

public class q2438 {
    public static void main(String[] args) {
        /*
         * 첫번째 줄부터 N번째 줄까지 차례대로 별 출력
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
