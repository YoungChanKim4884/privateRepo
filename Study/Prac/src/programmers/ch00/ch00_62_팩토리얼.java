package programmers.ch00;

public class ch00_62_팩토리얼 {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i=1; i<=11; i++){
            answer++;
            for(int j=1; j<=i; j++){
                num = num * j;
            }
            if(num>n){
                break;
            }
            num = 1;
        }
        answer = answer - 1;
        return answer;
    }
}
