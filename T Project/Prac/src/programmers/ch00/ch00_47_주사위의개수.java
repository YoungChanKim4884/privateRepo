package programmers.ch00;

public class ch00_47_주사위의개수 {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0; i<box.length; i++){
            answer = answer * (box[i] / n);
        }
        return answer;
    }
}
