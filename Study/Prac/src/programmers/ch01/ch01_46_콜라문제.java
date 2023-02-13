package programmers.ch01;

public class ch01_46_콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n/a>0){
            n -= a;
            answer += b;
            n += b;
        }
        return answer;
    }
}
