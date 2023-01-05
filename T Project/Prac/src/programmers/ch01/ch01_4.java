package programmers.ch01;

public class ch01_4 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer = answer + arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}
