package programmers.ch00;

public class ch00_39_모음제거 {
    public String solution(String my_string) {
        String answer = my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
        return answer;
    }
}
