package step.fourFundamentalRules;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class q10172 {
    /*
     * 아래와 같이 같아지 출력
     *  |\_/|
     *	|q p|   /}
     *	( 0 )"""\
     *	|"^"`    |
     *	||_/=\\__|
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("|\\_/|\n");
        bw.write("|q p|   /}\n");
        bw.write("( 0 )\"\"\"\\\n");
        bw.write("|\"^\"`    |\n");
        bw.write("||_/=\\\\__|");
        bw.flush();
        bw.close();
    }
}
