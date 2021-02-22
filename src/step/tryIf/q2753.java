package step.tryIf;

import java.util.Scanner;

public class q2753 {
    public static void main(String[] args) {
        /*
         * 년도를 입력받아 윤년 1, 아니면 0 출력
         * 윤년은 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때
         */
        Scanner input = new Scanner(System.in);
        int year;
        year = input.nextInt();
        input.close();
        result(year);
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
