package step.tryIf;

import java.io.*;

public class q9498 {
    /*
     * 시험점수를 입력받아 성적 출력
     * 90~100 : A
     * 80~89 : B
     * 70~79 : C
     * 60~69 : D
     * 나머지 : F
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int score = Integer.parseInt(br.readLine());
        if( score>=90 && score<=100 ) bw.write('A');
        else if( score>=80 && score<=89 ) bw.write('B');
        else if( score>=70 && score<=79 ) bw.write('C');
        else if( score>=60 && score<=69 ) bw.write('D');
        else bw.write('F');
        br.close();
        bw.flush();
        bw.close();
    }
}
