package programmers.ch00;

public class ch00_8 {
    public int solution(int angle) {
        int answer = 4;
        if(0<angle && angle<90){
            answer = 1;
        }else if(angle==90){
            answer = 2;
        }else if(90<angle && angle<180){
            answer = 3;
        }
        return answer;
    }
}
