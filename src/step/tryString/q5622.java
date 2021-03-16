package step.tryString;

import java.io.IOException;

public class q5622 {
    /*
     * 1: 2초, 2: 3초..... 9: 10초, 0: 11초
     * 2: ABC, 3: DEF, 4: GHI, 5: JKL, 6: MNO, 7: PQRS
     * 8: TUV, 9: WXYZ
     * 알파벳 입력했을때 걸리는 시간 출력
     */
    public static void main(String[] args) throws IOException {
        int c=0, cnt=0;
        while(true){
            c = System.in.read();
            if(c == '\n') break;
            else if(c>='A' && c<='C') cnt+=3;
            else if(c<='F') cnt+=4;
            else if(c<='I') cnt+=5;
            else if(c<='L') cnt+=6;
            else if(c<='O') cnt+=7;
            else if(c<='S') cnt+=8;
            else if(c<='V') cnt+=9;
            else if(c<='Z') cnt+=10;
        }
        System.out.println(cnt);
    }
}
