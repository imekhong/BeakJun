package step.tryIf;

import java.util.Scanner;

public class q1330 {
    public static void main(String[] args) {
        /*
         * 두 정수 A,B를 입력받아 비교 출력
         * A가 B보다 클때 > 출력
         * A가 B보다 작을때 < 출력
         * A와 B가 같을때 == 출력
         */
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        result(a, b);
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
