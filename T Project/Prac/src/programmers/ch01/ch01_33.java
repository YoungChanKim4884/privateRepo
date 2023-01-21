package programmers.ch01;

public class ch01_33 {
    public String solution(String s) {
        int cnt=0;
        String answer = "";
        String[] word = s.split("");
        for(int i=0; i<=word.length-1; i++){
            if(word[i].equals(" ")){
                cnt = 0;
            }else{
                if(cnt%2==0){
                    word[i] = word[i].toUpperCase();
                    cnt++;
                }else{
                    word[i] = word[i].toLowerCase();
                    cnt++;
                }
            }
        }
        for(int i=0; i<=word.length-1; i++){
            answer = answer + word[i];
        }
        return answer;
    }
}
