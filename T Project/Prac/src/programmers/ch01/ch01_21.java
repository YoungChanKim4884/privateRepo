package programmers.ch01;

public class ch01_21 {
    public String solution(String s) {
        String answer = "";
        int sLen = s.length();
        if(sLen%2==1){
            answer = s.substring(sLen/2, sLen/2+1);
        }else{
            answer = s.substring(sLen/2-1, sLen/2+1);
        }
        System.out.print(answer);
        return answer;
    }
}
