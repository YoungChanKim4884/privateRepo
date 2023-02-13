package programmers.ch00;

public class ch00_90_저주의숫자3 {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while(true){
            answer++;
            if(answer%3==0){
                continue;
            }else if(Integer.toString(answer).contains("3")){
                continue;
            }
            if(cnt==n){
                break;
            }
            cnt++;
        }
        return answer;
    }
}
