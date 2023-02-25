package programmers.ch02;

public class ch02_8_다음큰숫자 {
    public int solution(int n) {
        int answer = n;
        String nbi = Long.toBinaryString(answer);
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<nbi.length(); i++){
            if(nbi.charAt(i)=='1'){
                cnt1++;
            }
        }
        while(true){
            answer++;
            nbi = Long.toBinaryString(answer);
            for(int i=0; i<nbi.length(); i++){
                if(nbi.charAt(i)=='1'){
                    cnt2++;
                }
            }
            if(cnt1==cnt2){
                break;
            }else{
                cnt2 = 0;
            }
        }
        return answer;
    }
}
