package programmers.ch00;

public class ch00_85_치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;
        int cnt = 0;
        for(int i=1; i<=chicken; i++){
            cnt++;
            if(cnt%10==0){
                cnt = 1;
                answer++;
            }
        }
        return answer;
    }
}
