package programmers.ch00;

public class ch00_21_문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=str.length-1; i>=0; i--){
            answer = answer + str[i];
        }
        return answer;
    }
}
