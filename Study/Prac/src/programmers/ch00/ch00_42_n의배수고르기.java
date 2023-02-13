package programmers.ch00;

public class ch00_42_n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[cnt] = numlist[i];
                cnt++;
            }
        }
        return answer;
    }
}
