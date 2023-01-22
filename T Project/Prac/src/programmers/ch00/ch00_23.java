package programmers.ch00;

public class ch00_23 {
    public int solution(int[] numbers) {
        int tmp;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]<numbers[j]){
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        int answer = numbers[0] * numbers[1];
        return answer;
    }
}
