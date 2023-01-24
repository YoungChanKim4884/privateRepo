package programmers.ch00;

public class ch00_67_진료순서정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int cnt = 0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
                if(i==j){
                    continue;
                }
                if(emergency[i]<emergency[j]){
                    cnt++;
                }
            }
            answer[i] = cnt + 1;
            cnt = 0;
        }
        return answer;
    }
}
