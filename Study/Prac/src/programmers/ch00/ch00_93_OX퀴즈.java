package programmers.ch00;

public class ch00_93_OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            if(str[1].equals("+")){
                if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if(Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
            for(int j=0; j<str.length; j++){
                
            }
            
        }
        return answer;
    }
}
