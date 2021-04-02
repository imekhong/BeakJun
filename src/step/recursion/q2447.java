package step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2447 {
    /*
     * N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때,
     * 크기 N의 패턴은 N×N 정사각형 모양이다.
     * 크기 3의 패턴은 가운데에 공백이 있고,
     * 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
     *|***
     *|* *
     *|***
     * N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의
     * (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다.
     * 입력: N(3의 거듭제곱)
     * 출력: N번째 줄까지 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println();
    }
}
