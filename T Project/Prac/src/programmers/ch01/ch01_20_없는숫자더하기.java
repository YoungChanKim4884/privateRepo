package programmers.ch01;

public class ch01_20_없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0; i<numbers.length; i++){
            answer = answer - numbers[i];
        }
        return answer;
    }
}
