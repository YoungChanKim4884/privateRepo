package programmers.ch00;

public class ch00_34_순서쌍의개수 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                if(Math.sqrt(n)==i){
                    answer++;
                }else{
                    answer = answer + 2;
                }
            }
        }
        return answer;
    }
}
