package programmers.ch00;

import java.util.Arrays;

public class ch00_68_한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        int cnt = 0;
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str.length; j++){
                if(i==j){
                    continue;
                }
                if(str[i].equals(str[j])){
                    cnt++;
                }
            }
            if(cnt==0){
                answer = answer + str[i];
            }
            cnt = 0;
        }
        return answer;
    }
}
