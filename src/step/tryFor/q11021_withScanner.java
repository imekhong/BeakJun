package step.tryFor;

import java.util.Scanner;

public class q11021_withScanner {
    public static void main(String[] args) {
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
            System.out.println("Case #"+(j+1)+": "+sum);
        }
        sc.close();
    }
}
