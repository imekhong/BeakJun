package step.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q15596 {
    /*
     * 정수 n개가 주어졌을때 n개의 합을 구하는 함수
     * long sum(int[] a); 클래스 이름: Test
     * a: 합을 구해야하는 n개가 저장된 배열
     * 리턴: a에 포함되어 있는 정수 n개의 합
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] a = new int[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            a[i++] = Integer.parseInt(st.nextToken());
        }
        Test t = new Test();
        System.out.println(t.sum(a));
    }
}

class Test{
    long sum(int[] a){
        long ans = 0;
        for(int tmp: a)
            ans += (long)tmp;
        return ans;
    }
}
