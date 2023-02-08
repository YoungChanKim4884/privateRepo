package programmers.ch01;

import java.util.Arrays;

public class ch01_39_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String tmp = "";
        for(int i=0; i<strings.length-1; i++){
            for(int j=i+1; j<strings.length; j++){
                if(strings[i].charAt(n)>strings[j].charAt(n)){
                    tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }
        for(int i=0; i<strings.length-1; i++){
            for(int j=i+1; j<strings.length; j++){
                if(strings[i].charAt(n)==strings[j].charAt(n)){
                    Arrays.sort(strings,i,j+1);
                }
            }
        }
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i];
        }
        return answer;
    }
}
