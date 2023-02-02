package programmers.ch01;

import java.util.Arrays;

public class ch01_40_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] test = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(test);
            answer[i] = test[commands[i][2]-1];
        }
        return answer;
    }
}
