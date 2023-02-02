package programmers.ch00;

public class ch00_95_분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int max = 0;
        int a = 0;
        int b = 0;
        int[] answer = {0,0};
		for(int i=1; i<=denom1 && i<=denom2; i++){
			if(denom1%i==0 && denom2%i==0){
				max = i;
			}
		}
        a = (denom1 * numer2 + denom2 * numer1) / max;
        b = (denom1 * denom2) / max;
        int test = 0;
        if(a>b){
            test = a;
        }else{
            test = b;
        }
        for(int i=2; i<=test; i++){
            if(a%i==0 && b%i==0){
                a = a / i;
                b = b / i;
                i--;
            }
        }
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}
