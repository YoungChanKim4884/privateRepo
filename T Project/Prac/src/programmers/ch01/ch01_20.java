package programmers.ch01;

public class ch01_20 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0; i<numbers.length; i++){
            answer = answer - numbers[i];
        }
        return answer;
    }
}
