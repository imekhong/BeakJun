package step.tryMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1712 {
    /*
     * 노트북 생산 고정지출 A, 1대당 드는 지출B, 노트북 가격C일 때
     * 최초로 이익이 발생하는 판매량 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        if(C<=B) System.out.println(-1);
        else System.out.println(A/(C-B)+1);
    }
}
