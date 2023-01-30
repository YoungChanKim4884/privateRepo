package programmers.ch00;

public class ch00_84_로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                answer = "wrong pw";
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                }
            }
        }
        return answer;
    }
}
