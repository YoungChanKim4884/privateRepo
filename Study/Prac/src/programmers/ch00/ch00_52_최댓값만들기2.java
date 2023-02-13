package programmers.ch00;

public class ch00_52_최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = -100000001;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]*numbers[j]>answer){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        return answer;
    }
}
