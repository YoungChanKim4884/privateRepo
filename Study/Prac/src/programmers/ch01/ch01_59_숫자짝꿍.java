package programmers.ch01;

public class ch01_59_숫자짝꿍 {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        int[] cnt = new int[10];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=9; i++){
            for(int j=0; j<X.length(); j++){
                if(i==(X.charAt(j)-'0')){
                    xCnt[i]++;
                    continue;
                }
            }
            for(int j=0; j<Y.length(); j++){
                if(i==(Y.charAt(j)-'0')){
                    yCnt[i]++;
                    continue;
                }
            }
            cnt[i] = xCnt[i]<=yCnt[i]? xCnt[i] : yCnt[i];
        }
        for(int i=9; i>=0; i--){
            for(int j=0; j<=cnt[i]; j++){
                if(j==0){continue;}
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.equals("")){
            answer += -1;
        }
        if(answer.charAt(0)-'0'==0){
            answer = "0";
        }
        return answer;
    }
}
