package programmers.ch01;

import java.util.Arrays;
import java.util.Comparator;

public class ch01_55_명예의전당1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] kArr = new int[k];
        for(int i=0; i<score.length; i++){
            
            if(i<k){
                kArr[i] = score[i];
                Integer[] tmp = Arrays.stream(kArr).boxed().toArray(Integer[]::new);
                Arrays.sort(tmp, Comparator.reverseOrder());
                answer[i] = tmp[i];
                for(int j=0; j<tmp.length; j++){
                    kArr[j] = tmp[j];
                }
            }else{
                for(int j=kArr.length-1; j>=0; j--){
                    if(kArr[j]<score[i]){
                        kArr[j] = score[i];
                        break;
                    }
                }
                Integer[] tmp = Arrays.stream(kArr).boxed().toArray(Integer[]::new);
                Arrays.sort(tmp, Comparator.reverseOrder());
                for(int j=0; j<tmp.length; j++){
                    kArr[j] = tmp[j];
                }
                answer[i] = kArr[k-1];
            }
        }
        return answer;
    }
}
