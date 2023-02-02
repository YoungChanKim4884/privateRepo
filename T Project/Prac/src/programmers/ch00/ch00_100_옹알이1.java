package programmers.ch00;

public class ch00_100_옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;
        String str = "";
        int cnt = 0;
        for(int i=0; i<babbling.length; i++){
            str = babbling[i];
            str = str.replace("aya", " ");
            str = str.replace("woo", " ");
            str = str.replace("ye", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");
            if(str.equals("")){
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }
}
