package step.tryWhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10951 {
    /*
     * 여러개의 테스트케이스로 이루어져있으며
     * 각 테스트는 한줄로 이루어 져있고 A,B가 주어진다
     * 각 테스트 케이스마다 A+B를 출력
     */
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        String str = "";
        try{
            while((str = br.readLine())!= null){
                st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a+b).append('\n');
            }
            br.close();
        }catch(Exception e){
            return;
        }finally {
            System.out.println(sb);
        }
    }
}
