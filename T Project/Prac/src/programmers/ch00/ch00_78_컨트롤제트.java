package programmers.ch00;

public class ch00_78_컨트롤제트 {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            try{
                Integer.parseInt(str[i]);
                answer = answer + Integer.parseInt(str[i]);
            }catch(Exception e){
                answer = answer - Integer.parseInt(str[i-1]);
            }
        }
        return answer;
    }
}
