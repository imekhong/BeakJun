package step.tryIf;

import java.util.Scanner;

public class q9498 {
    public static void main(String[] args) {
        /*
         * 시험점수를 입력받아 성적 출력
         * 90~100 : A
         * 80~89 : B
         * 70~79 : C
         * 60~69 : D
         * 나머지 : F
         */
        Scanner input = new Scanner(System.in);
        int score;
        score = input.nextInt();
        input.close();
        result(score);
    }
    static void result(int score) {
        if( score>=0 && score<=100 ) {
            if( score>=90 && score<=100 ) {
                System.out.println("A");
            } else if( score>=80 && score<=89 ) {
                System.out.println("B");
            } else if( score>=70 && score<=79 ) {
                System.out.println("C");
            } else if( score>=60 && score<=69 ) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
