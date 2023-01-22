package programmers.ch00;

public class ch00_40_개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int cnt = 0;
        for(int i=5; i>=1; i-=2){
            cnt = hp / i;
            hp = hp % i;
            answer = answer + cnt;
            cnt = 0;
        }
        return answer;
    }
}
