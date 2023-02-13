package programmers.ch00;

public class ch00_45_가위바위보 {
    public String solution(String rsp) {
        String[] str = rsp.split("");
        String answer = "";
        for(int i=0; i<str.length; i++){
            if(str[i].equals("0")){
                answer = answer + "5";
            }else if(str[i].equals("2")){
                answer = answer + "0";
            }else{
                answer = answer + "2";
            }
        }
        return answer;
    }
}
