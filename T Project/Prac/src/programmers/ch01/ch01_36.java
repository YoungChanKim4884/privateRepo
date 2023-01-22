package programmers.ch01;

public class ch01_36 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        int tmp1 = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>tmp){
                tmp = sizes[i][0];
            }
            if(sizes[i][1]>tmp1){
                tmp1 = sizes[i][1];
            }
        }
        answer = tmp * tmp1;
        return answer;
    }
}
