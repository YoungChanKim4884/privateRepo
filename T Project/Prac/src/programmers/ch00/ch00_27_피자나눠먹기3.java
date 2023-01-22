package programmers.ch00;

public class ch00_27_피자나눠먹기3 {
    public int solution(int slice, int n) {
        int answer = n / slice;
        if(n % slice!=0){
            answer++;
        }
        return answer;
    }
}
