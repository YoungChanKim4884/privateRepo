package programmers.ch00;

public class ch00_36_문자열안에문자열 {
    public int solution(String str1, String str2) {
        int answer = 2;
        if(str1.indexOf(str2, 0)>=0){
            answer = 1;
        }
        return answer;
    }
}
