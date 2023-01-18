package programmers.ch01;

public class ch01_24 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        String tmp = "";
        for(int i=0; i<str.length-1; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i].compareTo(str[j])<0){
                    tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        for(int i=0; i<str.length; i++){
            answer = answer + str[i];
        }
        return answer;
    }
}
