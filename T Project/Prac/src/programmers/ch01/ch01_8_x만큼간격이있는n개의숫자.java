package programmers.ch01;

public class ch01_8_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++){
            if(i==0){
                answer[i] = x;
            }else{
                answer[i] = answer[i-1] + x;
            }
        }
        System.out.print(answer);
        return answer;
    }
}
