package programmers.ch02;

import java.util.HashMap;
import java.util.Set;

public class ch02_22_위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        for(int i=0; i<clothes.length; i++){
            if(map1.containsKey(clothes[i][1])){
                map1.put(clothes[i][1], (int)(map1.get(clothes[i][1])+1));
            }else{
                map1.put(clothes[i][1], 1);
            }
        }
        Set<String> keySet = map1.keySet();
        
        // value + 1 을 하여 곱하는 이유
        // 각 key 값의 value 별로 착용할 수 있는 가지수가 0개 ~ value개 이기 때문에
        for (String key : keySet) {
            answer *= map1.get(key)+1;
        }
        
        // answer--의 이유
        // 현재 총 계산값은 아무것도 착용하지 않은 경우의 수 1개가 포함되어 있음
        answer--;
        
        return answer;
    }
}
