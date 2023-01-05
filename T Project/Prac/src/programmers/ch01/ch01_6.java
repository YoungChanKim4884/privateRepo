package programmers.ch01;

public class ch01_6 {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        result = result - (long)result;
        System.out.println(result);
        if(result==0.0){
            result = Math.sqrt(n);
            answer = ((long)result + 1) * ((long)result + 1);
        }else{
            answer = -1;
        }
        return answer;
    }
}
