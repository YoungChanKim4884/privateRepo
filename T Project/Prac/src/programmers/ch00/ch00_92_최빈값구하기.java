package programmers.ch00;

public class ch00_92_최빈값구하기 {
    public int solution(int[] array) {
        int answer = -2;
        int cnt = 0;
        int cnt2 = 0;
        int maxcnt = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j]){
                    cnt2++;
                }
            }
            if(maxcnt<cnt2){
                maxcnt = cnt2;
            }
            cnt2 = 0;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j]){
                    cnt++;
                }
            }
            
            if(cnt==maxcnt){
                if(answer==-2){
                    answer = array[i];
                }else{
                    if(answer!=array[i]){
                        answer = -1;
                        break;
                    }
                }
            }
            cnt = 0;
        }
        return answer;
    }
}
