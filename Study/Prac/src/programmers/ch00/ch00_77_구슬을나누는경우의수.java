package programmers.ch00;

public class ch00_77_구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        double sum = 1;
        for(int i=0; i<share; i++){
            sum = (sum * (balls-i)) / (i+1);
        }
        int answer = (int)sum;
        return answer;
    }
}
