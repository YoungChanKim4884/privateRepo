package programmers.ch00;

public class ch00_75_잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        int num = my_str.length() / n;
        if(my_str.length() % n > 0){
            num++;
        }
        String[] answer = new String[num];
        for(int i=0; i<answer.length-1; i++){
            answer[i] = my_str.substring(0, n);
            my_str = my_str.substring(n);
        }
        answer[answer.length-1] = my_str.substring(0);
        return answer;
    }
}
