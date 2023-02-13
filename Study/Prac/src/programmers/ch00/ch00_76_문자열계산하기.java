package programmers.ch00;

import java.util.ArrayList;

public class ch00_76_문자열계산하기 {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        ArrayList<Integer> arrNum = new ArrayList<>();
        ArrayList<String> arrStr = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            try{
                Integer.parseInt(str[i]);
                arrNum.add(Integer.parseInt(str[i]));
            }catch(Exception e){
                arrStr.add(str[i]);
            }
        }
        int answer = arrNum.get(0);
        for(int i=0; i<arrStr.size(); i++){
            if(arrStr.get(i).equals("+")){
                answer = answer + arrNum.get(i+1);
            }else{
                answer = answer - arrNum.get(i+1);
            }
        }
        return answer;
    }
}
