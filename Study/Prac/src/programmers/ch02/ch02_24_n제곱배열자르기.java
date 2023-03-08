package programmers.ch02;

public class ch02_24_n제곱배열자르기 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int a = (int)(left / n);
        int b = (int)(left % n);
        int cnt = 0;
        for(long i=left; i<=right; i++){
            if(a>b){
                answer[cnt] = a + 1;
            }else{
                answer[cnt] = b + 1;
            }
            if(b+1<n){
                b++;
            }else{
                b = 0;
                a++;
            }
            cnt++;
        }
        return answer;
    }
}
