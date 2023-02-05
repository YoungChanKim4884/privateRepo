package programmers.ch01;

import java.util.Arrays;

public class ch01_44_폰켓몬 {
    public int solution(int[] nums) {
        int N = nums.length / 2;
        int answer = N;
        int[] intarr = Arrays.stream(nums).distinct().toArray();
        if(N>intarr.length){
            answer = intarr.length;
        }
        return answer;
    }
}
