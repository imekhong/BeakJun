package step.tryMath;

import java.util.Scanner;

public class q2292_withScanner {
    public static void main(String[] args) {
        int x = (new Scanner(System.in)).nextInt();
        int n = 1;
        int max = 1;
        while(true){
            if(x<=max) break;
            max += 6*(n++);
        }
        System.out.println(n);
    }
}
