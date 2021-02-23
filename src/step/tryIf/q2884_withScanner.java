package step.tryIf;

import java.util.Scanner;

public class q2884_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m;
        h = sc.nextInt();
        m = sc.nextInt();
        if(m < 45) {
            if( h == 0 ) {
                h = 24;
            }
            h -= 1;
            m = (m+60)-45;
        }
        else {
            m -= 45;
        }
        System.out.println(h+" "+m);
        sc.close();
    }
}
