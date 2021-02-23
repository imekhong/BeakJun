package step.tryIf;

import java.util.Scanner;

public class q14681_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, r=0;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        if( x>0 && y>0 ) {
            r = 1;
        }else if( x<0 && y>0 ) {
            r = 2;
        }else if( x<0 && y<0 ) {
            r = 3;
        }else if( x>0 && y<0 ) {
            r = 4;
        }
        System.out.println(r);
    }
}
