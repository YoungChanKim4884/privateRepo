package programmers.ch00;

public class ch00_28 {
    public int[] solution(int n) {
        int num = n / 2;
        if(n%2!=0){
            num++;
        }
        int[] answer = new int[num];
        for(int i=0; i<num; i++){
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }
}
