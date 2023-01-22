package programmers.ch00;

public class ch00_26_문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            for(int j=0; j<n; j++){
                answer = answer + str[i];
            }
        }
        return answer;
    }
}
