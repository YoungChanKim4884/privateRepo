package programmers.ch00;

public class ch00_49_가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        for(int i=0; i<array.length; i++){
            if(answer[0]<array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
