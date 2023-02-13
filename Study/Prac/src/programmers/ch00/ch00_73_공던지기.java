package programmers.ch00;

public class ch00_73_공던지기 {
    public int solution(int[] numbers, int k) {
        int num = k * 2 - 1;
        while(num>numbers.length){
            num = num - numbers.length;
        }
        int answer = numbers[num-1];
        return answer;
    }
}
