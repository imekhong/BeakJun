package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1157_withBufferdReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        for(int i = 0; i<str.length(); i++){
            int res = 0;
            int get = str.charAt(i);
            if(get < 97) res = get - 65;
            else res = get - 97;
            ++arr[res];
        }
        int max = 0;
        boolean flag = false;
        for(int i=0; i<26; i++){
            if( arr[i] > arr[max] ) {
                max = i;
                flag = false;
            }
            else if( arr[i] == arr[max] && i!=max ) flag = true;
        }
        if(flag) System.out.println("?");
        else     System.out.println((char)(max+65));
        br.close();
    }
}
