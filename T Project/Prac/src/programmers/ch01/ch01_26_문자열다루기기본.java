package programmers.ch01;

public class ch01_26_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            Integer.parseInt(s);
        }
        catch (NumberFormatException ex){
            answer = false;
        }
        if(s.length()!=4 && s.length()!=6){
            answer = false;
        }
        return answer;
    }
}
