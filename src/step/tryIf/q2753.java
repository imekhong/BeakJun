package step.tryIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2753 {
    /*
     * 년도를 입력받아 윤년 1, 아니면 0 출력
     * 윤년은 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        if( ((y%4 == 0) && (y%100 != 0)) || (y%400 == 0)) System.out.println("1");
        else System.out.println("0");
        br.close();
    }
}
