package step.tryIf;

import java.util.Scanner;

public class q2753_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        result(year);
        sc.close();
    }
    static void result(int year) {
        if( year>=1 && year<= 4000) {
            if( ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }
    }
}
