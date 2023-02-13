package programmers.ch00;

public class ch00_35_자릿수더하기 {
    public int solution(int n) {
        int cnt = 1;
        int num = n;
        while(num/10!=0){
            cnt++;
            num = num / 10;
        }
        int answer = 0;
        for(int i=0; i<cnt; i++){
            answer = answer + (n%10);
            n = n / 10;
        }
        return answer;
    }
}
