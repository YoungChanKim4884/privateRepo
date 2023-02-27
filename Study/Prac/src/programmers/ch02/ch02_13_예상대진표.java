package programmers.ch02;

public class ch02_13_예상대진표 {
    public int solution(int n, int a, int b){
        int answer = 0;
        int c = a<b? a:b;
        int d = a<b? b:a;
        while(true){
            if(c%2==1 && c+1==d){
                answer++;
                break;
            }else{
                answer++;
                if(c % 2 == 1){
                    c++;
                }
                if(d % 2 == 1){
                    d++;
                }
                c /= 2;
                d /= 2;
            }
        }
        return answer;
    }
}
