package programmers.ch00;

import java.util.ArrayList;

public class ch00_48_문자열정렬하기1 {
    public int[] solution(String my_string) {
        String[] str = my_string.split("");
        ArrayList<Integer> arrList = new ArrayList<>();
        int cnt = str.length;
        for(int i=0; i<str.length; i++){
            try{
                Integer.parseInt(str[i]);
                arrList.add(Integer.parseInt(str[i]));
            }catch (Exception e){
                cnt--;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        int tmp = 0;
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        return answer;
    }
}
