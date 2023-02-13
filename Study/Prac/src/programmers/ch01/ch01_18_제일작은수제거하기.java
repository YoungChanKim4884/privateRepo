package programmers.ch01;

import java.util.ArrayList;

public class ch01_18_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int cnt = 0;
        int num = 0;
        if(arr.length==1){
            arrList.add(-1);
        }else{
            cnt = arr[0];
            for(int i=1; i<arr.length; i++){
                if(cnt>arr[i]){
                    cnt = arr[i];
                    num = i;
                }
            }
            for(int i=0; i<arr.length; i++){
                if(i==num){
                    continue;
                }
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
