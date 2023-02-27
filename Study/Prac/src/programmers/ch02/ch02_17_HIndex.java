package programmers.ch02;

import java.util.Arrays;

public class ch02_17_HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            if(citations[i] >= citations.length-i){
                answer = citations.length-i;
                break;
            }
        }
        return answer;
    }
}
