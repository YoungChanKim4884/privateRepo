package programmers.ch02;

import java.util.Arrays;

public class ch02_12_구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int i = 0;
        int j = people.length-1;
        while(true){
            if(i==j){
                answer++;
                break;
            }else if(i>j){
                break;
            }else if(people[i] + people[j] > limit){
                answer++;
                j--;
            }else if(people[i] + people[j] <= limit){
                answer++;
                i++;
                j--;
            }
        }
        return answer;
    }
}
