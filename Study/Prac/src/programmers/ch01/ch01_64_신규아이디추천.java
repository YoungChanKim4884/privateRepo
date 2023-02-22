package programmers.ch01;

public class ch01_64_신규아이디추천 {
    public String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        while(true){
            answer = answer.replace("..", ".");
            if(answer.indexOf("..")==-1){
                break;
            }
        }
        
        if(answer.indexOf(".")==0){
            answer = answer.substring(1);
        }
        
        if(answer.length()>15){
            answer = answer.substring(0, 15);
        }
        
        if(answer.length()!=0 && answer.lastIndexOf(".")==answer.length()-1){
            answer = answer.substring(0, answer.length()-1);
        }
        
        if(answer.equals("")){
            answer = "aaa";
        }
        
        if(answer.length()<3){
            for(int i=answer.length(); i<3; i++){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}
