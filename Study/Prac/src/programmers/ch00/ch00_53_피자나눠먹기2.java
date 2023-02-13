package programmers.ch00;

public class ch00_53_피자나눠먹기2 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if((6*i)%n==0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
