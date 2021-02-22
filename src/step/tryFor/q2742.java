package step.tryFor;

import java.util.Scanner;

public class q2742 {
    public static void main(String[] args) {
        /*
         * N부터 1까지 한 줄에 하나씩 출력
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--)
            System.out.println(i);
    }
}
