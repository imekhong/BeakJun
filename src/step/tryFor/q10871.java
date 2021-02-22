package step.tryFor;

import java.util.Scanner;

public class q10871 {
    public static void main(String[] args) {
        /*
         * N과 X를 입력받아
         * 수열 A를 이루는 정수 N개가 주어지고
         * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            if(a[j]<x)
                System.out.print(a[j]+" ");
        }
    }
}
