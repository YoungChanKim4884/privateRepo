package programmers.ch00;

public class ch00_87_문자열밀기 {
    public int solution(String A, String B) {
        int cnt = 0;
        String[] str = A.split("");
        String tmp = "";
        String C = A;
        for(int i=0; i<str.length; i++){
            if(C.equals(B)){
                break;
            }
            C = "";
            tmp = str[str.length-1];
            for(int j=0; j<str.length-1; j++){
                str[str.length-1-j] = str[str.length-2-j];
            }
            str[0] = tmp;
            cnt++;
            for(int j=0; j<str.length; j++){
                C = C + str[j];
            }
        }
        int answer = 0;
        if(cnt==str.length){
            answer = -1;
        }else{
            answer = cnt;
        }
        return answer;
    }
}
