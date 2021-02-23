package step.fourFundamentalRules;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class q10171 {
    /*
     * 아래와 같이 고양이 출력
     * \    /\
     *	)  ( ')
     *	(  /  )
     *	 \(__)|
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        sb.append("\\    /\\").append('\n')
                .append(" )  ( ')").append('\n')
                .append("(  /  )").append('\n')
                .append(" \\(__)|");
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
