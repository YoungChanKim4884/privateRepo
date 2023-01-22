package programmers.ch00;

public class ch00_16 {
    public int solution(int[] dot) {
        int answer = 4;
        if(0<dot[0] && 0<dot[1]){
            answer = 1;
        }else if(dot[0]<0 && 0<dot[1]){
            answer = 2;
        }else if(dot[0]<0 && dot[1]<0){
            answer = 3;
        }
        return answer;
    }
}
