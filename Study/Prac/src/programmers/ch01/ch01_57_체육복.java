package programmers.ch01;

public class ch01_57_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n];
        for(int i=0; i<reserve.length; i++){
            clothes[reserve[i]-1]++;
        }
        for(int i=0; i<lost.length; i++){
            clothes[lost[i]-1]--;
        }
        for(int i=0; i<clothes.length; i++){
            if(i!=0 && clothes[i]==-1 && clothes[i-1]==1){
                clothes[i-1]--;
                clothes[i]++;
            }else if(i!=clothes.length-1 && clothes[i]==-1 && clothes[i+1]==1){
                clothes[i+1]--;
                clothes[i]++;
            }
            if(clothes[i]>=0){
                answer++;
            }
        }
        return answer;
    }
}
