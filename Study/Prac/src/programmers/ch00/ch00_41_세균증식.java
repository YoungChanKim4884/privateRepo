package programmers.ch00;

public class ch00_41_세균증식 {
    public int solution(int n, int t) {
        int answer = n;
        for(int i=1; i<=t; i++){
            answer = answer * 2;
        }
        return answer;
    }
}
