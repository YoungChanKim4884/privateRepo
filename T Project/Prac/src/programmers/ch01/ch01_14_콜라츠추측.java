package programmers.ch01;

public class ch01_14_콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        int i=0;
        for(i=1; i<=501; i++){
            if(n==1){
                break;
            }
            if(n%2==0){
                n = n / 2;
            }else{
                n = (n * 3) + 1;
            }
            answer++;
        }
        if(i>=500 && n!=1){
            answer = -1;
        }
        return answer;
    }
}
