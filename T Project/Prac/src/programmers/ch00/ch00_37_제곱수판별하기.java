package programmers.ch00;

public class ch00_37_제곱수판별하기 {
    public int solution(int n) {
        double num = Math.sqrt(n);
        int answer = 1;
        if(num!=(int)num){
            answer = 2;
        }
        return answer;
    }
}
