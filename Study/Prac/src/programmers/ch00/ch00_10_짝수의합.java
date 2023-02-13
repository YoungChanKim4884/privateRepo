package programmers.ch00;

public class ch00_10_짝수의합 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer = answer + i;
            }
        }
        return answer;
    }
}
