package programmers.ch00;

import java.util.ArrayList;

public class ch00_70_숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        ArrayList<String> arrList = new ArrayList<>();
        ArrayList<String> arrList2 = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            arrList.add(str[i]);
        }
        for(int i=0; i<arrList.size(); i++){
            try{
                Integer.parseInt(arrList.get(i));
                arrList2.add(arrList.get(i));
                for(int j=i+1; j<arrList.size(); j++){
                    try{
                        Integer.parseInt(arrList.get(j));
                        arrList2.set(i, arrList2.get(i) + arrList.get(j));
                        arrList.remove(arrList.get(j));
                        j--;
                    }catch (NumberFormatException ex){
                        break;
                    }
                }
            }catch (NumberFormatException ex){
                arrList.remove(arrList.get(i));
                i--;
            }
        }
        for(int i=0; i<arrList2.size(); i++){
            answer = answer + Integer.parseInt(arrList2.get(i));
        }
        return answer;
    }
}
