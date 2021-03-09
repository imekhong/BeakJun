package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q10809 {
    /*
     * 단어가 입력되면
     * 각 알파벳에 대해서 단어에 등장한 알파벳 첫 위치를 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i = 0; i<str.length(); i++){
            int get = str.charAt(i)-97;
            if(arr[get] == -1)
                arr[get] = i;
        }
        for(int i = 0; i<26; i++){
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
        br.close();
    }
}
