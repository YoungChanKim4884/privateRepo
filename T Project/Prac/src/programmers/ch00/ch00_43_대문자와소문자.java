package programmers.ch00;

public class ch00_43_대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(str[i].toLowerCase())){
                answer = answer + str[i].toUpperCase();
            }else{
                answer = answer + str[i].toLowerCase();
            }
        }
        return answer;
    }
}
