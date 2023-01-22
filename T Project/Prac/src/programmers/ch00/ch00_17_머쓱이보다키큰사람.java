package programmers.ch00;

public class ch00_17_머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(height<array[i]){
                answer++;
            }
        }
        return answer;
    }
}
