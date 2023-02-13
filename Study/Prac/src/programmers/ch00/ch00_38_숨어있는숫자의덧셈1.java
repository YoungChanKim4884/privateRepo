package programmers.ch00;

import java.util.ArrayList;

public class ch00_38_숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        ArrayList<String> arrList = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            arrList.add(str[i]);
        }
        for(int i=0; i<arrList.size(); i++){
            try{
                Integer.parseInt(arrList.get(i));
            }
            catch (NumberFormatException ex){
                arrList.remove(arrList.get(i));
                i--;
            }
        }
        for(int i=0; i<arrList.size(); i++){
            answer = answer + Integer.parseInt(arrList.get(i));
        }
        return answer;
    }
}
