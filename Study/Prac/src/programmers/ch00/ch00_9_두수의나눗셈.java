package programmers.ch00;

public class ch00_9_두수의나눗셈 {
    public int solution(int num1, int num2) {
        double a = ((double)num1 / num2) * 1000;
        int answer = (int)a;
        return answer;
    }
}
