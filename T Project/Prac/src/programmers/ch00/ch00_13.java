package programmers.ch00;

public class ch00_13 {
    public int solution(int n) {
        int answer = n / 7;
        if(n%7!=0){
            answer++;
        }
        return answer;
    }
}
