package programmers.ch01;

public class ch01_47_푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";
        int[] food2 = new int[food.length]; 
        for (int i = 0; i < food.length; i++) {
            food2[i] = food[i];
        }
        for(int i=1; i<food.length; i++){
            if(food[i]-2>=0){
                food[i] -= 2;
                answer += i;
                i--;
            }
        }
        answer += 0;
        for(int i=food2.length-1; i>0; i--){
            if(food2[i]-2>=0){
                food2[i] -= 2;
                answer += i;
                i++;
            }
        }
        return answer;
    }
}
