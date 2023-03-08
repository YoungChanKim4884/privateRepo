package programmers.ch02;

import java.util.HashSet;
import java.util.Set;

public class ch02_26_연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> answer = new HashSet<>();
        int sum = 0;
        
        // 길이가 i개인 연속부분 수열 계산 
        for (int i=1; i<=elements.length; i++) {
            for (int j=0; j<elements.length; j++) {
                for (int k=0; k<i; k++) {
                    
                    // 더해야 할 원소가 length 보다 클 경우 -length
                    if (j+k > elements.length-1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
                }
                answer.add(sum);
                sum = 0;
            }
        }
        return answer.size();
    }
}
