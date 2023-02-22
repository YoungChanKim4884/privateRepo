package programmers.ch01;

public class ch01_65_문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        char x = ' ';
        int xCnt = 0;
        int nonXCnt = 0;
        while(true){
            x = s.charAt(0);
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==x){
                    xCnt++;
                }else{
                    nonXCnt++;
                }
                
                if(xCnt==nonXCnt){
                    answer++;
                    s = s.substring(i+1);
                    xCnt = 0;
                    nonXCnt = 0;
                    break;
                }
            }
            
            if(xCnt!=nonXCnt){
                answer++;
                break;
            }else if(s.length()==1){
                answer++;
                break;
            }else if(s.length()==0){
                break;
            }
        }
        return answer;
    }
}
