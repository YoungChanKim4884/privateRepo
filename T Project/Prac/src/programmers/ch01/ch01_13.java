package programmers.ch01;

public class ch01_13 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}