package programmers.ch01;

import java.util.Arrays;

public class ch01_58_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!(participant[i].equals(completion[i]))){
                answer = participant[i];
                break;
            }
        }
        if(answer.equals("")){
            answer = participant[participant.length-1];
        }
        return answer;
    }
}
