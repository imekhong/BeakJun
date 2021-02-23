package step.tryFor;

import java.util.Scanner;

public class q2739_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=1; i<10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
        sc.close();
    }
}
