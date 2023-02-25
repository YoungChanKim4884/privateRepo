package programmers.ch02;

public class ch02_10_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        for(int i=1; i<words.length; i++){
            if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)){
                answer[0] = ((i+1) % n == 0) ? n : (i+1) % n;
                answer[1] = ((i+1) % n == 0) ? ((i+1) / n) : ((i+1) / n) + 1;
                break;
            }
            for(int j=0; j<=i-1; j++){
                if(words[i].equals(words[j])){
                    answer[0] = ((i+1) % n == 0) ? n : (i+1) % n;
                    answer[1] = ((i+1) % n == 0) ? ((i+1) / n) : ((i+1) / n) + 1;
                    cnt++;
                    break;
                }
            }
            if(cnt!=0){
                break;
            }
        }
        return answer;
    }
}
