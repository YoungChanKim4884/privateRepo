package programmers.ch01;

public class ch01_43_2016년 {
    public String solution(int a, int b) {
        String answer = "";
        for(int i=1; i<a; i++){
            if(i==1){
                b = b + 31;
            }else if(i==2){
                b = b + 29;
            }else if(i==3){
                b = b + 31;
            }else if(i==4){
                b = b + 30;
            }else if(i==5){
                b = b + 31;
            }else if(i==6){
                b = b + 30;
            }else if(i==7){
                b = b + 31;
            }else if(i==8){
                b = b + 31;
            }else if(i==9){
                b = b + 30;
            }else if(i==10){
                b = b + 31;
            }else if(i==11){
                b = b + 30;
            }
        }
        b = b % 7;
        if(b==5){
            answer = "TUE";
        }else if(b==6){
            answer = "WED";
        }else if(b==0){
            answer = "THU";
        }else if(b==1){
            answer = "FRI";
        }else if(b==2){
            answer = "SAT";
        }else if(b==3){
            answer = "SUN";
        }else if(b==4){
            answer = "MON";
        }
        return answer;
    }
}
