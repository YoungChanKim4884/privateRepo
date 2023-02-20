package programmers.ch01;

import java.util.ArrayList;

public class ch01_57_n_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Integer> intArr2 = new ArrayList<>();
        for(int i=0; i<lost.length; i++){
            intArr2.add(lost[i]);
        }
        for(int i=0; i<reserve.length; i++){
            intArr.add(reserve[i]);
            for(int j=0; j<lost.length; j++){
                if(reserve[i]==lost[j]){
                    intArr.remove(i);
                }
            }
        }
        for(int i=0; i<intArr.size(); i++){
            for(int j=0; j<intArr2.size(); j++){
                if(intArr2.get(j)-1<=intArr.get(i) && intArr.get(i)<=intArr2.get(j)+1){
                    answer++;
                    intArr.remove(i);
                    intArr2.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        return answer;
    }
}
