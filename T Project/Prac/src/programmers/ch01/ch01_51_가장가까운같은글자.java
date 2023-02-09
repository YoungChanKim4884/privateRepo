package programmers.ch01;

public class ch01_51_가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        int cnt = 0;
        int leng = 0;
        for(int i=0; i<str.length; i++){
            if(i==0){
                answer[i] = -1;
                continue;
            }
            for(int j=i-1; j>=0; j--){
                if(str[i].equals(str[j])){
                    cnt++;
                }
                if(cnt>0){
                    leng = i-j;
                    break;
                }
            }
            if(cnt==0){
                answer[i] = -1;
            }else{
                answer[i] = leng;
            }
            cnt = 0;
            leng = 0;
        }
        return answer;
    }
}
