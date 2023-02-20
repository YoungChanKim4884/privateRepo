package programmers.ch01;

public class ch01_53_1차다트게임 {
	public int solution(String dartResult) {
        char[] darts = dartResult.toCharArray();
        int[] scores = new int[3];
        int cnt = 0;
        
        for(int i=0; i<darts.length; i++){
            if('0'<=darts[i] && darts[i]<='9'){
                if(darts[i]=='1' && darts[i+1]=='0'){
                    scores[cnt] = 10;
                    cnt++;
                    i++;
                }else{
                    scores[cnt] = darts[i] - '0';
                    cnt++;
                }
            }else if(darts[i] == 'S'){
                scores[cnt-1] = (int)Math.pow(scores[cnt-1], 1);
            }else if(darts[i] == 'D'){
                scores[cnt-1] = (int)Math.pow(scores[cnt-1], 2);
            }else if(darts[i] == 'T'){
                scores[cnt-1] = (int)Math.pow(scores[cnt-1], 3);
            }else if(darts[i] == '*'){
                if(cnt==1){
                    scores[cnt-1] *= 2;
                }else{
                    scores[cnt-2] *= 2;
                    scores[cnt-1] *= 2;
                }
            }else if(darts[i] == '#'){
                scores[cnt-1] *= -1;
            }
        }
        return scores[0] + scores[1] + scores[2];
    }
}
