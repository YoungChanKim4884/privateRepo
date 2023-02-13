package programmers.ch00;

public class ch00_32_옷가게할인받기 {
    public int solution(int price) {
        int answer = price;
        if(500000<=price){
            answer = (int)(price * 0.8);
        }else if(300000<=price){
            answer = (int)(price * 0.9);
        }else if(100000<=price){
            answer = (int)(price * 0.95);
        }
        return answer;
    }
}
