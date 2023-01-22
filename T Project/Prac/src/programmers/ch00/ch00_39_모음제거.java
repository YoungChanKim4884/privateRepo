package programmers.ch00;

public class ch00_39_모음제거 {
    public String solution(String my_string) {
        String answer = my_string;
        answer = answer.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }
}
