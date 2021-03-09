package step.tryString;

import java.io.IOException;

public class q1157 {
    /*
     * 입력받은 단어에서 가장 많이 쓰인 알파벳 출력
     * 대소문자 구분 없고, 결과가 여러개면 ? 출력
     */
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int input = System.in.read();
        while(input>='A' && input<='z'){
            if(input<'a') arr[input - 'A']++;
            else arr[input - 'a']++;
            input = System.in.read();
        }
        int max = 0;
        int pos = -1;
        boolean flag = false;
        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
                pos = i;
                flag = false;
            }else if(arr[i] == max)
                flag = true;
        }
        if(flag) System.out.print("?");
        else System.out.println((char)(pos+65));
    }
}
