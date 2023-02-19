package programmers.ch01;

public class ch01_61_옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String str = "";
        int cnt = 0;
        for(int i=0; i<babbling.length; i++){
            str = babbling[i];
            str = str.replace("ayaaya", "aya1");
            str = str.replace("woowoo", "woo1");
            str = str.replace("yeye", "ye1");
            str = str.replace("mama", "ma1");
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
