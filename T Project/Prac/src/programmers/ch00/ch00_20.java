package programmers.ch00;

public class ch00_20 {
    public int solution(int[] sides) {
        int answer = 2;
        int tmp = 0;
        for(int i=1; i<sides.length; i++){
            if(sides[0]<sides[i]){
                tmp = sides[0];
                sides[0] = sides[i];
                sides[i] = tmp;
            }
        }
        if(sides[0]<sides[1] + sides[2]){
            answer = 1;
        }
        return answer;
    }
}
