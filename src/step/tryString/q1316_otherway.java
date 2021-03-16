package step.tryString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1316_otherway {
    /*
     * 그룹단어: 알파벳이 한번씩만 입력되던가 여러번 입력되더라도 붙어있는 경우
     * 입력: 테스트케이스 수와 그 다음 테스트케이스만큼 단어 입력(개행으로 구분)
     * 출력: 그룹 단어의 개수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<num; i++){
            String str = br.readLine();
            if(check(str)) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
    public static boolean check(String str){
        boolean[] alp = new boolean[26];
        int pre = 0;
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(pre != now){
                if(!alp[now-'a']){
                    alp[now-'a'] = true;
                    pre = now;
                }else
                    return false;
            }
        }
        return true;
    }
}
