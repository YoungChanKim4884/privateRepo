package programmers.ch00;

public class ch00_50_배열회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int tmp = 0;
        if(direction.length()==4){
            tmp = numbers[0];
            for(int i=1; i<answer.length; i++){
                answer[i-1] = numbers[i];
            }
            answer[answer.length-1] = tmp;
        }else{
            tmp = numbers[answer.length-1];
            for(int i=0; i<answer.length-1; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = tmp;
        }
        return answer;
    }
}
