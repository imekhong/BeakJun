package step.tryFor;

import java.util.Scanner;

public class q2439 {
    public static void main(String[] args) {
        /*
         * 첫번째 줄부터 N번째 줄까지 차례대로 별 출력(오른쪽 정렬느낌)
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            for (int j = num-i; j >= 1; j--)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
