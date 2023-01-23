package programmers.ch00;

public class ch00_65_가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 100000000;
        for(int i=0; i<array.length; i++){
            if(tmp>Math.abs(array[i] - n)){
                tmp = Math.abs(array[i] - n);
                answer = array[i];
            }else if(tmp==Math.abs(array[i] - n)){
                if(answer>array[i]){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
