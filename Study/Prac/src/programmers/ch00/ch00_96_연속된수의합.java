package programmers.ch00;

public class ch00_96_연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt = 0;
        int x = 0;
        for(int i=0; i<num; i++){
            x = x + i;
        }
        cnt = (total - x) / num;
        for(int i=0; i<answer.length; i++){
            answer[i] = cnt;
            cnt++;
        }
        return answer;
    }
}
