package programmers.ch01;

public class ch01_18_n {
    public String solution(String phone_number) {
        String answer = "";
        String[] phone = phone_number.split("");
        for(int i=1; i<=phone.length-4; i++){
            answer = answer + "*";
        }
        answer = answer + phone_number.substring(phone_number.length()-4, phone_number.length());
        System.out.print(answer);
        return answer;
    }
}
