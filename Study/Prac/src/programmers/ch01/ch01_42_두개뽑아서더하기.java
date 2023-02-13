package programmers.ch01;

import java.util.ArrayList;
import java.util.Arrays;

public class ch01_42_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(arrList.size()==0){
                    arrList.add(numbers[i] + numbers[j]);
                }else{
                    for(int k=0; k<arrList.size(); k++){
                        if(arrList.get(k)==(numbers[i] + numbers[j])){
                            cnt++;
                        }
                    }
                    if(cnt==0){
                        arrList.add(numbers[i] + numbers[j]);
                    }
                    cnt = 0;
                }
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
