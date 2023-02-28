package programmers.ch02;

import java.util.Arrays;

public class ch02_21_귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int leng = 1;
        for(int i=1; i<tangerine.length; i++){
            if(tangerine[i]!=tangerine[i-1]){
                leng++;
            }
        }
        int[] arr1 = new int[leng];
        int[] arr2 = new int[leng];
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<tangerine.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[j]==tangerine[i]){
                    arr2[j]++;
                    cnt1++;
                    break;
                }
                
            }
            if(cnt1==0){
                arr1[cnt2] = tangerine[i];
                arr2[cnt2]++;
                cnt2++;
            }
            cnt1 = 0;
        }
        Arrays.sort(arr2);
        int sum = 0;
        boolean flag = false;
        for(int i=arr2.length-1; i>=0; i--){
            answer++;
            sum += arr2[i];
            if(sum >= k){
                flag = true;
                break;
            }
        }
        return answer;
    }
}
