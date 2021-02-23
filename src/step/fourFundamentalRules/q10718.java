package step.fourFundamentalRules;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class q10718 {
    /*
     * 아래와 같이 출력
     * 강한친구 대한육군
     * 강한친구 대한육군
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("강한친구 대한육군\n강한친구 대한육군");
        bw.flush();
        bw.close();
    }
}
