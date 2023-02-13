package programmers.ch00;

public class ch00_89_특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] num = new int[numlist.length];
        int[] num2 = new int[numlist.length];
        int cnt = 0;
        for(int i=0; i<numlist.length; i++){
            num[i] = n - numlist[i];
        }
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(i==j){
                    continue;
                }
                if(Math.abs(num[i])>Math.abs(num[j])){
                    cnt++;
                }else if(Math.abs(num[i])==Math.abs(num[j])){
                    if(num[i]>num[j]){
                        cnt++;
                    }
                }
            }
            num2[i] = cnt;
            cnt = 0;
        }
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
                if(num2[j]==i){
                    answer[i] = numlist[j];
                }
            }
        }
        return answer;
    }
}
