package programmers.ch00;

public class ch00_56_숫자찾기 {
    public int solution(int num, int k) {
        int answer = -1;
        String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
        for (int i=0; i<temp.length(); i++){
            digits[i] = temp.charAt(i) - '0';
            if(digits[i]==k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}
