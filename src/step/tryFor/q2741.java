package step.tryFor;

import java.util.Scanner;

public class q2741 {
    public static void main(String[] args) {
        /*
         * 1부터 N까지 한 줄에 하나씩 출력
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
            System.out.println(i);
    }
}
