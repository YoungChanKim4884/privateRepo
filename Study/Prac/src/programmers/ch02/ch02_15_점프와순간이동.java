package programmers.ch02;

public class ch02_15_점프와순간이동 {
    public int solution(int n) {
        int answer = 0;
        while(true){
            if(n==1){
                answer++;
                break;
            }
            if(n % 2 == 1){
                answer++;
                n -= 1;
            }
            n /= 2;
        }
        return answer;
    }
}
