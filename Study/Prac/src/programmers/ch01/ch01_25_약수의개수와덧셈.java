package programmers.ch01;

public class ch01_25_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int i=left; i<=right; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt%2==0){
                answer = answer + i;
            }else{
                answer = answer - i;
            }
            cnt = 0;
        }
        return answer;
    }
}
