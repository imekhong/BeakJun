package step.tryIf;

import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        /*
         * 첫 줄에 두 정수 H,M을 입력받아 알람시계를 맞출때
         * 맞춘 시간보다 45분 빨리 알람이 설정되게 시간 출력
         */
        Scanner input = new Scanner(System.in);
        int h,m;
        h = input.nextInt();
        m = input.nextInt();
        input.close();
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
    }
}
