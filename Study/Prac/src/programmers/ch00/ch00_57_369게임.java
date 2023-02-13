package programmers.ch00;

public class ch00_57_369게임 {
    public int solution(int order) {
        int answer = 0;
        while(order!=0){
            if(order%10==3 || order%10==6 || order%10==9){
                answer++;
            }
            order = order / 10;
        }
        
        return answer;
    }
}
