package programmers.ch01;

import java.util.ArrayList;

public class ch01_50_소수만들기 {
    public int solution(int[] nums) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int answer = 0;
        int cnt = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    arrList.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        for(int i=0; i<arrList.size(); i++){
            for(int j=2; j<=arrList.get(i); j++){
                if(arrList.get(i)%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                answer++;
            }
            cnt = 0;
        }
        return answer;
    }
}
