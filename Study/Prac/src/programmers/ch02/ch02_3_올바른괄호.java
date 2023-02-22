package programmers.ch02;

public class ch02_3_올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                a++;
            }else if(s.charAt(i)==')'){
                a--;
            }
            if(a<0){
                answer = false;
                break;
            }
        }
        if(a!=0){
            answer = false;
        }

        return answer;
    }
}
