package programmers.ch01;

import java.util.Arrays;

public class ch01_54_과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int i=score.length-1; i>=0; i-=m){
            if(i-(m-1)>=0){
                answer += score[i-(m-1)] * m;
            }
        }

        return answer;
    }
}
