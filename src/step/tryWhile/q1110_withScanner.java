package step.tryWhile;

import java.util.Scanner;

public class q1110_withScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOri = sc.nextInt();
        int num = numOri;
        int cnt = 1;
        while (true){
            int numL = num / 10;
            int numR = num % 10;
            int sum = numL + numR;
            num = (numR*10) + (sum%10);
            if(numOri == num) break;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
