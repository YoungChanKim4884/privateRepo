package programmers.ch01;

public class ch01_26 {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            int number = Integer.parseInt(s);
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
