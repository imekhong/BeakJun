package step.tryFor;

import java.util.Scanner;

public class q11022_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
