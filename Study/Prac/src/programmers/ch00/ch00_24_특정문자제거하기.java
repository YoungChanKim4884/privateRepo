package programmers.ch00;

import java.util.*;

public class ch00_24_특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";
        ArrayList<String> str = new ArrayList<>();
        String[] str1 = my_string.split("");
        for(int i=0; i<str1.length; i++){
            if(str1[i].equals(letter)==false){
                str.add(str1[i]);
            }
        }
        for(int i=0; i<str.size(); i++){
            answer = answer + str.get(i);
        }
        return answer;
    }
}
