package programmers.ch01;

import java.util.*;

public class ch01_31 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<=arr.length-2; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i]==arr[j]){
                    continue;
                }else{
                    arrList.add(arr[i]);
                    i = j - 1;
                    break;
                }
            }
        }
        arrList.add(arr[arr.length-1]);
        int[] answer = new int[arrList.size()];
        for(int i=0; i<=answer.length-1; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
