package step.tryIf;

import java.util.Scanner;

public class q14681 {
    public static void main(String[] args) {
        /*
         * 첫 줄에 정수 x
         * 두번째 줄에 정수 y를 입력받아
         * (x,y)의 사분면 출력
         */
        Scanner input = new Scanner(System.in);
        int x, y, r=0;
        x = input.nextInt();
        y = input.nextInt();
        input.close();
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
