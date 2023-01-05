package programmers.ch01;

public class ch01_1 {
    public int solution(int n) {
        int answer = 0;
        int a;
        for(int i=1; i<=10; i++){
            a = n % 10;
            n = n / 10;
            answer = answer + a;
        }
        return answer;
    }
}
