package programmers.ch02;

public class ch02_5_이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int cnt = 0;
        while(!(s.equals("1"))){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    answer[1]++;
                }else{
                    cnt++;
                }
            }
            answer[0]++;
            s = "" + Integer.toBinaryString(cnt);
            cnt = 0;
        }
        return answer;
    }
}
