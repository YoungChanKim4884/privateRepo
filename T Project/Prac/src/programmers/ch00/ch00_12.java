package programmers.ch00;

public class ch00_12 {
    public int solution(int n, int k) {
        int answer = (n * 12000) + ((k - (n / 10)) * 2000);
        return answer;
    }
}
