package programmers.ch00;

public class ch00_70_2_숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;

        // repalceAll과 정규표현식을 이용
        // 영대문자, 영소문자일 경우만 공백추가
        // 추가한 공백을 이용한 split 사용
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
