package programmers.ch00;

import java.util.Arrays;

public class ch00_63_A로B만들기 {
    public int solution(String before, String after) {
        int answer = 1;
        char[] arrbefore = before.toCharArray();
        Arrays.sort(arrbefore);
        char[] arrafter = after.toCharArray();
        Arrays.sort(arrafter);
        for(int i=0; i<arrafter.length; i++){
            if(arrbefore[i]!=arrafter[i]){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
