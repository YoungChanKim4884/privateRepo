package programmers.ch01;

public class ch01_3_짝수와홀수 {
    public String solution(int num) {
        String answer = "Odd";
        if(num%2==0){
            answer = "Even";
        }
        return answer;
    }
}
