package programmers.ch00;

import java.util.ArrayList;

public class ch00_55_약수구하기 {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
                arrList.add(i);
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
