package programmers.ch02;

public class ch02_16_멀리뛰기 {
    public long solution(int n) {
        long a = 1;
        long b = 2;
        long answer = n;
        if(n>=3){
            for(int i=3; i<=n; i++){
                answer = (a + b) % 1234567;
                a = b;
                b = answer;
            }
        }
        return answer;
    }
}
