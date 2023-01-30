package programmers.ch00;

public class ch00_79_삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;
        int a = 0;
        int b = 0;
        if(sides[0]>sides[1]){
            a = sides[0];
            b = sides[1];
        }else{
            a = sides[1];
            b = sides[0];
        }
        answer = (a+b)-(a-b+1);
        return answer;
    }
}
