package step.tryFor;

import java.util.Scanner;

public class q11022 {
    public static void main(String[] args) {
        /*
         * 테스트케이스를 입력 받아
         * 각 테스트케이스는 한줄이며 각줄에 A,B가 주어지고
         * 모두 입력받은 후 Case #x: A+B = C를 출력
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] input = new int[num][2];
        for(int i=0; i<num; i++){
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0; j<num; j++){
            sum = input[j][0]+input[j][1];
            System.out.println("Case #"+(j+1)+": "+input[j][0]+" + "+input[j][1]+" = "+sum);
        }
    }
}
