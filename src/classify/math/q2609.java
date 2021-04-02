package classify.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2609 {
    /*
     * 주어진 두 수의 최대공약수, 최소공배수 구하기
     * (참조: 유클리드 호제법)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int r = 0;
        if(a>b){
            r = gcd(a,b);
        }else{
            r = gcd(b,a);
        }
        System.out.println(r);
        System.out.println(a*b/r);
    }
    public static int gcd(int x, int y){
        while(y>0){
            int tmp = x;
            x = y;
            y = tmp%y;
        }
        return x;
    }
}
