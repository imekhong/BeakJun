package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q3053 {
    /*
     * 입력: 반지름
     * 출력1: r^2*3.14
     * 출력2: r^2*2
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        System.out.println(Math.pow(r,2)*Math.PI);
        System.out.println(Math.pow(r,2)*2);
        //아래 방식이 더 느림
        //System.out.println(r*r*Math.PI);
        //System.out.println(r*r*2);
        //System.out.println(String.format("%.6f", Math.pow(r,2)*Math.PI));
        //System.out.println(String.format("%.6f", Math.pow(r,2)*2));
        br.close();
    }
}
