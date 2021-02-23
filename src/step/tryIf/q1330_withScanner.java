package step.tryIf;

import java.util.Scanner;

public class q1330_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        result(a, b);
        sc.close();
    }
    static void result(int a, int b) {
        if(a > b) {
            System.out.println(">");
        } else if(a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
