package programmers.ch00;

public class ch00_22 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]==n){
                answer++;
            }
        }
        return answer;
    }
}
