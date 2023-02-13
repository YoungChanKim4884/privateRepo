package programmers.ch01;

import java.util.*;

public class ch01_32_3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        ArrayList<Integer> arr = new ArrayList<>();
        int length = -1;
        while(num!=0){
            length++;
            arr.add(num%3);
            num = num / 3;
        }
        
        for(int i=0; i<=length; i++){
            answer = answer + ((int)Math.pow(3, length-i) * arr.get(i));
        }
        return answer;
    }
}
