package programmers.ch00;

public class ch00_54_인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        String tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        String answer = "";
        for(int i=0; i<str.length; i++){
            answer = answer + str[i];
        }
        return answer;
    }
}
