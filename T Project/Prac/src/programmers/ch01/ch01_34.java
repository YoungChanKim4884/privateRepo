package programmers.ch01;

public class ch01_34 {
    public int solution(int[] d, int budget) {
        int tmp;
        int answer = 0;
        for(int i=0; i<d.length-1; i++){
            for(int j=i+1; j<d.length; j++){
                if(d[i]>d[j]){
                    tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
        }
        for(int i=0; i<d.length; i++){
            budget = budget - d[i];
            if(budget>=0){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}
