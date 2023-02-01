package programmers.ch00;

public class ch00_91_다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        String[] str = polynomial.split(" ");
        for(int i=0; i<str.length; i+=2){
            if(str[i].contains("x")){
                if(str[i].equals("x")){
                    str[i] = "1x";
                }
                a = a + Integer.parseInt(str[i].substring(0, str[i].length() - 1));
            }else{
                b = b + Integer.parseInt(str[i]);
            }
        }
        if(a==0 && b==0){
            answer = "";
        }else if(a==0){
            answer = "" + b;
        }else if(b==0){
            if(a==1){
                answer = "x";
            }else{
                answer = "" + a + "x";
            }
        }else{
            if(a==1){
                answer = "x + " + b;
            }else{
                answer = "" + a + "x + " + b;
            }
        }
        return answer;
    }
}
