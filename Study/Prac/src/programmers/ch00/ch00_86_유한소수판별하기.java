package programmers.ch00;

public class ch00_86_유한소수판별하기 {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i=2; i<=a; i++){
            if(a%i==0 && b%i==0){
                a = a / i;
                b = b / i;
                i--;
            }
        }
        
        while(b%2==0){
            b = b / 2;
        }
        while(b%5==0){
            b = b / 5;
        }
        if(b!=1){
            answer = 2;
        }
        return answer;
    }
}
