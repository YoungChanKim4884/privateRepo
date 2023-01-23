package programmers.ch00;

public class ch00_44_암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        for(int i=code-1; i<str.length; i+=code){
            answer = answer + str[i];
        }
        return answer;
    }
}
