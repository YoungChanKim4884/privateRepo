package programmers.ch00;

public class ch00_94_다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;
        if(common[common.length-1] - common[common.length-2] == common[common.length-2] - common[common.length-3]){
            answer = common[common.length-1] + (common[common.length-1] - common[common.length-2]);
        }else{
            answer = common[common.length-1] * (common[common.length-1] / common[common.length-2]);
        }
        return answer;
    }
}
