package programmers.ch00;

public class ch00_31_중앙값구하기 {
    public int solution(int[] array) {
        int tmp = 0;
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        int answer = array[array.length / 2];
        return answer;
    }
}
