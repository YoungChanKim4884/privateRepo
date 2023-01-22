package programmers.ch00;

public class ch00_19 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[answer.length-i-1];
        }
        return answer;
    }
}
