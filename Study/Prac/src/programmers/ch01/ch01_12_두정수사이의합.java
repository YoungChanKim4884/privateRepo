package programmers.ch01;

public class ch01_12_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a<b){
            for(int i=a; i<=b; i++){
                answer = answer + i;
            }
        }else{
            for(int i=b; i<=a; i++){
                answer = answer + i;
            }
        }
        
        return answer;
    }
}
