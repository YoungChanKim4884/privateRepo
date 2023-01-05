package programmers.ch01;

public class ch01_5 {
    public int[] solution(long n) {
        int cnt = 0;
        long t = n;
        while(t/10!=0){
            cnt = cnt + 1;
            t = t / 10;
        }
        int[] answer = new int[cnt+1];
        for(int i=0; i<=cnt; i++){
            answer[i] = (int) (n%10);
            n=n/10;
        }
        return answer;
    }
}
