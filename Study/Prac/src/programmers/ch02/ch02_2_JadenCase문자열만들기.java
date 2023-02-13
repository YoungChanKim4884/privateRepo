package programmers.ch02;

public class ch02_2_JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        if(97<=charArr[0] && charArr[0]<=122){
            charArr[0] = (char)(charArr[0]-32);
        }
        answer += charArr[0];
        for(int i=1; i<charArr.length; i++){
            if(charArr[i-1]==' ' && (97<=charArr[i] && charArr[i]<=122)){
                charArr[i] = (char)(charArr[i]-32);
            }
            answer += charArr[i];
        }
        return answer;
    }
}
