package step.fourFundamentalRules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class q15792 {
    /*
     * 두 정수 AB를 입력받아 A/B 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        System.out.println(a.divide(b, MathContext.DECIMAL128).toPlainString());
        //System.out.println(a.divide(b, MathContext.DECIMAL128).toString());
        br.close();
    }
}
