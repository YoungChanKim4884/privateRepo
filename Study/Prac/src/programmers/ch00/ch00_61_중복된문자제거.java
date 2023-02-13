package programmers.ch00;

import java.util.ArrayList;
import java.util.Collections;

public class ch00_61_중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";
        int cnt = 0;
        String[] str = my_string.split("");
        ArrayList<String> arrList = new ArrayList<>();
        for(int i=str.length-1; i>=1; i--){
            for(int j=i-1; j>=0; j--){
                if(str[i].equals(str[j])){
                    cnt++;
                }
            }
            if(cnt==0){
                arrList.add(str[i]);
            }
            cnt = 0;
        }
        arrList.add(str[0]);
        Collections.reverse(arrList);
        for(int i=0; i<arrList.size(); i++){
            answer = answer + arrList.get(i);
        }
        return answer;
    }
}
