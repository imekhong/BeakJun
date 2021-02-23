package step.tryFor;

import java.util.Scanner;

public class q8393_withScanner {
    /*
     * 첫 줄에 정수 n을 입력받아
     * 1부터 n까지 합 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
