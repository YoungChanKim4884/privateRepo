package programmers.ch02;

import java.util.ArrayList;

public class ch02_25_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        int cnt1 = 0;
        int cnt2 = 0;
        while(true){
            cnt1++;
            for(int i=0; i<progresses.length; i++){
                if(progresses[i]>=100){
                    continue;
                }
                progresses[i] += speeds[i];
                if(progresses[i]>=100){
                    arr[i] = cnt1;
                    cnt2++;
                }
            }
            if(cnt2==progresses.length){
                break;
            }
        }
        ArrayList<Integer> arList = new ArrayList<>();
        arList.add(1);
        cnt1 = arr[0];
        cnt2 = 0;
        for(int i=1; i<arr.length; i++){
            if(cnt1<arr[i]){
                arList.add(1);
                cnt2++;
                cnt1 = arr[i];
            }else{
                arList.set(cnt2, arList.get(cnt2)+1);
            }
        }
        int[] answer = new int[arList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arList.get(i);
        }
        
        return answer;
    }
}
