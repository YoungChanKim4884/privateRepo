package programmers.ch01;

public class ch01_15 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<=1000; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
