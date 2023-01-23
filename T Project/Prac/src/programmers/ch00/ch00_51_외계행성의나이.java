package programmers.ch00;

public class ch00_51_외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        int tmp = 0;
        while(age/10>0 || age%10!=0){
            tmp = age%10;
            age = age / 10;
            if(tmp==0){
                answer = "a" + answer;
            }else if(tmp==1){
                answer = "b" + answer;
            }else if(tmp==2){
                answer = "c" + answer;
            }else if(tmp==3){
                answer = "d" + answer;
            }else if(tmp==4){
                answer = "e" + answer;
            }else if(tmp==5){
                answer = "f" + answer;
            }else if(tmp==6){
                answer = "g" + answer;
            }else if(tmp==7){
                answer = "h" + answer;
            }else if(tmp==8){
                answer = "i" + answer;
            }else{
                answer = "j" + answer;
            }
            tmp = 0;
        }
        return answer;
    }
}
