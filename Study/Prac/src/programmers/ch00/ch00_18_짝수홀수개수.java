package programmers.ch00;

public class ch00_18_짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
