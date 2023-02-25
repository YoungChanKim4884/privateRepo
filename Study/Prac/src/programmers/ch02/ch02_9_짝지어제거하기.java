package programmers.ch02;

import java.util.ArrayList;

public class ch02_9_짝지어제거하기 {
    public int solution(String s){
        int answer = 0;
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(ch.size()==0){
                ch.add(s.charAt(i));
            }else{
                if(ch.get(ch.size()-1).equals(s.charAt(i))){
                    ch.remove(ch.size()-1);
                }else{
                    ch.add(s.charAt(i));
                }
            }
        }
        if(ch.size()==0){
            answer++;
        }
        return answer;
    }
}
