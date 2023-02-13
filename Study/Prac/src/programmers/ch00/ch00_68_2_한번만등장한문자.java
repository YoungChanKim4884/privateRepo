package programmers.ch00;

import java.util.Arrays;

public class ch00_68_2_한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        for(int i=0; i<str.length; i++){
            if(i>0){
                if(str[i].equals(str[i-1])){
                    continue;
                }
            }
            if(i<str.length-1){
                if(str[i].equals(str[i+1])){
                    continue;
                }
            }
            answer = answer + str[i];
        }
        return answer;
    }
}
